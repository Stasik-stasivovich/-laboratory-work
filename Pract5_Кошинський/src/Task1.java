/*Author : Stanislav Koshynskyi
 * File: Task1.java
 * Task:
 * Намалювати різнокольоровий будинок в якого будуть:

вікна
двері
дах
димохід
дим
паркан
хмаринки
Далі Ваша фантазія.

Використовуйте цикли.

Додайте підпис на малюнок
 */
import java.awt.Color;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;


import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Task1 extends GraphicsProgram {
	private static final Color ROOF_COLOR = new Color(139,69,19);
	private static final Color WINDOW_COLOR = new Color(135,206,235);
	private static final Color WALL_COLOR = new Color(245,222,179);
	private static final Color DOOR_COLOR = new Color(101,67,33);
	public void run() {
		setSize(1200,550);
		createSky();
		createGrass();
		createHome();
		createWindow();
		createDoor();
		createRoof();
		createFence();
		createChimney();
		createSmoke();
		createClouds();
		addSignatuure();
		
	}
	//додаємо підпис
	private void addSignatuure() {
		GLabel signature = new GLabel("Кошинський Станіслав",850,30);
		signature.setColor(Color.black);
		signature.setFont("Arial-30");
		add(signature);
		
		
	}
	//створюємо хмарку за координатами
	private void createCloud(int x,int y){
		GOval cloud1=new GOval(x,y,75,75);
		GOval cloud2=new GOval(x+35,y+35,75,75);
		GOval cloud3=new GOval(x-35,y+35,75,75);
		GOval cloud4=new GOval(x-20,y+35,75,75);
		setColorAndFilledWhiteAndAdd(cloud1);
		setColorAndFilledWhiteAndAdd(cloud2);
		setColorAndFilledWhiteAndAdd(cloud3);
		setColorAndFilledWhiteAndAdd(cloud4);

		
	}
	//задаємо білий колір , зафарбовуємо і додаємо на екран
	private void setColorAndFilledWhiteAndAdd(GOval a) {
		
		a.setColor(Color.WHITE);
		a.setFilled(true);
		add(a);
		
	}
	//додаємо хмарки	
	private void createClouds() {
		createCloud(100, 100);
		createCloud(250, 100);
		createCloud(850, 100);
		createCloud(1050, 100);
	}
	//додаємо дим
	private void createSmoke() {
		GOval smoke = new GOval(425, 75,25,25);
		smoke.setColor(Color.GRAY);
		smoke.setFilled(true);
		add(smoke);
		for (int i=0;i<15;i++){
			int x;
			if (i%2==0){
				x=435-10*i;
			}
			else{
				x=435-10*i;
				
			}
			GOval smoketimes = new GOval(x, 75-i*15,25+i*2,25+i*10);
			smoketimes.setColor(Color.GRAY);
			smoketimes.setFilled(true);
			add(smoketimes);
		}
		
	}
	//додаємо димар
	private void createChimney() {
		GRect chimney = new GRect(425,100,50,75);
		chimney.setColor(ROOF_COLOR);
		chimney.setFilled(true);
		add(chimney);
		
	}
	//створюємо горизонтальні палички на паркана
	private void createNGorizontalBars(int x,int y,int weight,int a ){
		for(double i=0;i<a;i+=0.5){
			GLine bar = new GLine(x,y+i,x+weight,y+i);
			bar.setColor(ROOF_COLOR);
			add(bar);
		}
	
	}
	//створюємо вертикальні палички для паркана
	private void createNVerticalBars(int x,int y,int height,int a ){

		for (double i =0;i<a;i+=0.5){
			GLine bar = new GLine(x+i,y,x+i,y+height);
			bar.setColor(ROOF_COLOR);
			add(bar);
		}
	}//створюємо паркан
	private void createFence() {
		for (int i=0;i<15;i++){
			createNVerticalBars(100+i*20, 325, 75, 10);
		}
		for (int i=0;i<3;i++){
			createNGorizontalBars(100,350+i*20,300,5);
		}
		for (int i=0;i<15;i++){
			createNVerticalBars(820+i*20, 325, 75, 10);
		}
		for (int i=0;i<3;i++){
			createNGorizontalBars(820,350+i*20,280,5);
		}
		
	}
	//створюємо дах
	private void createRoof() {
		GLine leftRoofSide = new GLine(600,0,400,200);
		leftRoofSide.setColor(ROOF_COLOR);
		add(leftRoofSide);
		GLine rightRoofSide = new GLine(600,0,800,200);
		rightRoofSide.setColor(ROOF_COLOR);
		add(rightRoofSide);
		for (double i=0;i<200;i+=0.5){
			GLine roof = new GLine(600-i,0+i,800-i,200);
			roof.setColor(ROOF_COLOR);
			add(roof);
		}
		
	}
	//створюємо двері
	private void createDoor() {
		GRect door = new GRect(600,250,100,150);
		door.setColor(DOOR_COLOR);
		door.setFilled(true);
		add(door);
		GLine doorHandle = new GLine(625,320,650,320);
		doorHandle.setColor(Color.WHITE);
		add(doorHandle);
		
	}
	//створюємо вікно
	private void createWindow() {
		GRect window = new GRect(450,275,75,75);
		window.setColor(WINDOW_COLOR);
		window.setFilled(true);
		add(window);
		GLine windowStick1 = new GLine(487.5, 275, 487.5, 350);
		windowStick1.setColor(Color.BLACK);
		add(windowStick1);
		GLine windowStick2 = new GLine(450, 312.5, 525, 312.5);
		windowStick2.setColor(Color.BLACK);
		add(windowStick2);
		
	}
	// створюємо стіни будинка
	private void createHome() {
		GRect home = new GRect(400,200,400,200);
		home.setColor(WALL_COLOR);
		home.setFilled(true);
		add(home);
		
		
	}
	//створюємо траву
	private void createGrass() {
		GRect grass = new GRect(0,400,1200,150);
		grass.setColor(Color.GREEN);
		grass.setFilled(true);
		add(grass);
		
	}
	//створюємо небо
	private void createSky() {
		GRect sky = new GRect(0,0,1200,400);
		sky.setColor(Color.BLUE);
		sky.setFilled(true);
		add(sky);
		
	}
}
