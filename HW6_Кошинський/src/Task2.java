/*
 * File Task2.java
 2. Написати програму, що намалює стовпчики з біперів через кожні 50(або інше задане число) пікселів. Кольори біперів чергуються. Висота кожного наступного стовпчика більша за попередню на 2 (або інше задане число) біперів. Розмір біперів 50х50 (або інше задане число).

Біпер робити з чотирьох ліній.

Використати: константи, цикли. Це не Karel
 */


import java.awt.Color;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;


public class Task2 extends GraphicsProgram {
	private static final double VERTICAL_RADIUS=25;
	private static final double HORIZONTAL_RADIUS=25;
	private static final int N_START=10;
	private static final int DELTA_N=-2;
	private static final double DELTA_X=50;
	private static final double DELTA_Y=50;
	private static final int HEIGHT=700;
	private static final int WIDTH=700;
	private static final int START_X=10;
	private static final int START_Y=20;
	public void run(){
		int nNow;
		setSize(WIDTH,HEIGHT);
		
		int numberOfColumn=(int)((getWidth()-START_X+DELTA_X)/(2*HORIZONTAL_RADIUS+DELTA_X));
		for (int i=0;i<numberOfColumn;i++){
			nNow=N_START+i*DELTA_N;
			buildColumn(nNow,i);
			 
		}
	}
	
	//build column
	private void buildColumn(int nNow,int numberOfColumn) {
		Color color;
		double x=START_X+HORIZONTAL_RADIUS+(HORIZONTAL_RADIUS*2+DELTA_X)*numberOfColumn;//координата центра біпера по x
		int j=0;
		double y=VERTICAL_RADIUS+1;
		while (j<nNow&&y>=VERTICAL_RADIUS){
			if (j%3==0)color =Color.ORANGE;
			else if (j%3==1)color=Color.GREEN; 
			else color= Color.BLUE;
			y=getHeight()-START_Y-VERTICAL_RADIUS-(2*VERTICAL_RADIUS+DELTA_Y)*j;//координата центра біпера по y
			if (y>VERTICAL_RADIUS)createBeeper(x,y,color);
			j++;
			
		}
		
	}
	//create beeper from coordinate and fill color(size is constant)
	//tan for correct retreat
	private void createBeeper(double x,double y,Color color){
		double tan = VERTICAL_RADIUS/HORIZONTAL_RADIUS;
		for (double i=-VERTICAL_RADIUS;i<VERTICAL_RADIUS;i+=0.5){
			GLine line =new GLine(x-(Math.abs(i)-VERTICAL_RADIUS)/tan,y-i,x+(Math.abs(i)-VERTICAL_RADIUS)/tan,y-i);//рахуємо коордити ліній і створюєио їх
			line.setColor(color);
			add(line);
		}
	}
}
