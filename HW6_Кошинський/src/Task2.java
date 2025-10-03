/*
 * File Task2.java
 2. �������� ��������, �� ������� ��������� � ����� ����� ���� 50(��� ���� ������ �����) ������. ������� ����� ����������. ������ ������� ���������� ��������� ����� �� ��������� �� 2 (��� ���� ������ �����) �����. ����� ����� 50�50 (��� ���� ������ �����).

����� ������ � �������� ���.

�����������: ���������, �����. �� �� Karel
 */




import java.awt.Color;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;


public class Task2 extends GraphicsProgram {
	private static final double VERTICAL_RADIUS=15;
	private static final double HORIZONTAL_RADIUS=15;
	private static final int N_START=4;
	private static final int DELTA_N=-1;
	private static final double DELTA_X=50;
	private static final double DELTA_Y=50;
	private static final int HEIGHT=700;
	private static final int WIDTH=700;
	private static final int START_X=10;
	private static final int START_Y=20;
	public void run(){
		int j=0;
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
		double x=START_X+HORIZONTAL_RADIUS+(HORIZONTAL_RADIUS*2+DELTA_X)*numberOfColumn;
		for (int j=0;j<nNow;j++){
			if (j%3==0)color =Color.ORANGE;
			else if (j%3==1)color=Color.GREEN; 
			else color= Color.BLUE;
			double y=getHeight()-START_Y-VERTICAL_RADIUS-(2*VERTICAL_RADIUS+DELTA_Y)*j;
			if (y<VERTICAL_RADIUS)break;
			createBeeper(x,y,color);

			
		}
		
	}
	//create beeper from coordinate and fill color(size is constant)
	//tan for correct retreat
	//deltai becose we have `white noise` if have step on 1
	private void createBeeper(double x,double y,Color color){
		double tan = VERTICAL_RADIUS/HORIZONTAL_RADIUS;
		double deltaI;
		if (tan>1)deltaI=1/tan;
		else deltaI=tan;
		for (double i=0;i<=HORIZONTAL_RADIUS;i+=(deltaI/2)){
			GLine line = new GLine(x-i,y-VERTICAL_RADIUS+i*tan,x+HORIZONTAL_RADIUS-i,y+i*tan);
			line.setColor(color);
			add(line);
		}
	}
}
