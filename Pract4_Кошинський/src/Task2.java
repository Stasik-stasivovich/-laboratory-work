/*
Author : Koshynskyi Stanislav
file Task2.java
І на закінчення завдання в якому Карел має покласти біпер по центру 1-ої вулиці (першого рядка). Якщо ви працюєте з світом, що зображено на малюнку нижче,
то Карел має закінчити роботу стоячи на біпері по центру стрічки, як на малюнку нижче.
Тобто на дошці має стояти вісього один біпер. І цей біпер має бути розташований по центру першого рядка і Карел стоїть на ньому.

При вирішенні проблеми ви маєте спиратися на наступні знання про світ:

Карел не вміє рахувати
Карел починає роботу з клітинки 1х1 обличчам на схід з необмеженою кількістю біперів
Початковий світ не містить ні стін ні біперів
Світ може бути будь-яким, він не повинен бути квадратним, але ви можете вважати, що він принаймні, такий же високий, як і широкий
Якщо довжина рядка непарна, тоді Карел має покласти біпер саме по центру, якщо парна тоді в одній з двох центральних клітин
Не має різниці в якому напрямку Карел дивиться в кінці., але обов'язково стоїть на ногах.

*/


import stanford.karel.SuperKarel;


public class Task2 extends SuperKarel{
	public void run() {
		putInEdge();
		narrowingToMidle();
		lookAtEast();
	}

	//turn so that karel look at east
	private void lookAtEast() {
		while (notFacingEast()){
			turnLeft();
		}
	}

	//check whether karel in milde and narrowing if dont
	private void narrowingToMidle() {
		while (beepersPresent()){
			pickBeeper();
			if (frontIsClear())move();
			putBeeper();
			if (beepersPresent()){
				pickBeeper();
				if (beepersPresent()){
					pickBeeper();
				}
				else{ 
					putBeeper();
					goToNextBeper();
					turnAround();
				}
			}
		}
		putBeeper();
		
	}
	//move to next beper
	private void goToNextBeper() {
		move();
		while(noBeepersPresent())move();
		
	}
	//put beper in edge
	private void putInEdge() {
		putBeeper();
		goToWall();
		putBeeper();
		turnAround();
		goToWall();
		turnAround();
	}
	//gotowall
	private void goToWall() {
		while(frontIsClear())move();
	}
}