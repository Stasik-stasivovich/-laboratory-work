/*Author : Stanislav Koshynskyi
* File: Task1.java
* Task:Намалювати сонечко з променями.

Кількість променів задається константою.

Промені мають бути розміщені рівномірно
*/



import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Task1 extends GraphicsProgram{
	private static final int NUMBER_OF_RAYS=0;
	private static final int RADIUS=300;
	
	public void run(){
		setBackground(Color.BLACK);
		setSize(700,700);
		createSun();
		createRays();
	}
	//створюємо промені
	private void createRays() {
		if (NUMBER_OF_RAYS>0){
			double retreatDegree = (double)360/NUMBER_OF_RAYS;
			double nowDegree = 0;
			for (int i=0;i<NUMBER_OF_RAYS;i++){
				GLine ray = new GLine(325, 325,325+ RADIUS*Math.cos(Math.toRadians(nowDegree)), 325+RADIUS*Math.sin(Math.toRadians(nowDegree)));
				ray.setColor(Color.YELLOW);
				add(ray);
				nowDegree+=retreatDegree;
			}
		}
			
		
	}
	//створюємо сонце
	private void createSun() {
		GOval sun = new GOval(275,275,100,100);
		sun.setColor(Color.YELLOW);
		sun.setFilled(true);
		add(sun);
		
	
    }
}
