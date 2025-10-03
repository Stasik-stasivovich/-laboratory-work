
/*
 File Task1.java
 Author Stanislav Koshynskyi
 Task
 1. Написати програму, що намалює шахову доску.

Використати: константи, цикли.

Зображення маже бути схожим на наступне:

checks

Розмір шахової дошки = розміру вікна. І так, вона може бути не квадратною ;-(
Можливі варіанти малювання  будь-яких n*m рядків та колонок, які вписуються в розмір дошки
 
 
 
 */




import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Task1 extends GraphicsProgram{
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800;
	private static final double NUM_OF_COLUMNS=5;
	private static final double NUM_OF_ROWS=13;
	public void run(){
		setSize(WIDTH,HEIGHT);
		if (NUM_OF_COLUMNS*NUM_OF_ROWS>0){
			double heightsOfCell=getHeight()/NUM_OF_ROWS;
			double widthOfCell= getWidth()/NUM_OF_COLUMNS;
			fillWindow(widthOfCell,heightsOfCell);
		}
	}
	//заповнюємо вікно в шахматному порядку
	private void fillWindow(double widthOfCell,double heightOfCell) {
		for (int i=0;i<NUM_OF_ROWS;i++){
			for(int j=0;j<NUM_OF_COLUMNS;j++){
				GRect rect = new GRect(widthOfCell*j,heightOfCell*(NUM_OF_ROWS-i-1),widthOfCell,heightOfCell);
				rect.setFilled((i+j)%2==0);
				add(rect);
				
			}
		}
		
	}
}