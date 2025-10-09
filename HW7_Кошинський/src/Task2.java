/*
 Author Koshynskyi Stanislav
 File: Task2.java
 Task:Намалювати обличчя робота.

Обличчя складається з чотирьох частинок - голова, два ока, і рот

Використати константи HEAD_WIDTH, HEAD_HEIGHT, EYE_RADIUS, MOUTH_WIDTH, MOUTH_HEIGHT

Малюнок розміщується по центру вікна. При зміні розмірів вікна обличчя розміщується по центру вікна
 */

import java.awt.Color;
import java.awt.event.WindowFocusListener;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;


public class Task2 extends GraphicsProgram {
	private static final int WIDTH=300;
	private static final int HEIGHT=300;
	private static final int HEAD_WIDTH=(int)(WIDTH/2);
	private static final int HEAD_HEIGHT=(int)(HEIGHT/2);
	private static final int EYE_RADIUS= Math.min(HEAD_HEIGHT,HEAD_WIDTH)/7;
	private static final int MOUTH_WIDTH=HEAD_WIDTH/4;
	private static final int MOUTH_HEIGHT=HEAD_HEIGHT/4;
	public void run(){
		setSize(WIDTH,HEIGHT);
		GOval face = new GOval(getWidth()/2-HEAD_WIDTH/2,getHeight()/2-HEAD_HEIGHT/2,HEAD_WIDTH,HEAD_HEIGHT);
		face.setColor(Color.GRAY);
		face.setFilled(true);
		add (face);
		GOval rightEye = new GOval(getWidth()/2+HEAD_WIDTH/3-2*EYE_RADIUS,getHeight()/2-HEAD_HEIGHT/3+EYE_RADIUS,EYE_RADIUS,EYE_RADIUS);
		GOval leftEye = new GOval(getWidth()/2-HEAD_WIDTH/3+EYE_RADIUS,getHeight()/2-HEAD_HEIGHT/3+EYE_RADIUS,EYE_RADIUS,EYE_RADIUS);
		rightEye.setColor(Color.RED);
		rightEye.setFilled(true);
		leftEye.setColor(Color.RED);
		leftEye.setFilled(true);
		add (rightEye);
		add(leftEye);
		GOval mouth = new GOval(getWidth()/2-MOUTH_WIDTH/2,getHeight()/2+MOUTH_HEIGHT/2,MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setColor(Color.CYAN);
		mouth.setFilled(true);
		add(mouth);
	}	
}
