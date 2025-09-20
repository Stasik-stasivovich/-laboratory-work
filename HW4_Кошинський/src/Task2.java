
/*
Author : Koshynskyi Stanislav
file Task2.java

������ ��������� ���������� ������ � �����. ������� ��� ������ � ������ ������ ����.

��� ���� ���� ����-��� ������. ʳ������ ������ �� �����.

��� ���� ���� ����-��� ������. � ���� ���� ��������, �� ����� ������ ������ ������ (���� ��� ���������).

����� ���� �������� ������ �������� � ����-��� �������, ������ �� �����.
*/


import stanford.karel.SuperKarel;


public class Task2 extends SuperKarel{
	public void run(){
		if (frontIsBlocked())putBeeper();
		else{
			fillRow();
			gotoStartPos();
			while (leftIsClear()){
				putLeft();
				if (rightIsBlocked())goToFirstRightBeeper();
				else goToRightBeper();
				if (beepersPresent()){
					moveToWall();
					turnRight();
				}
				else{
					putBeeper();
					turnLeft();
					fillStage();
				}
			}
		lookAtEast();			
		}
	}
	private void moveToWall() {
		while (frontIsClear())move();
		
	}
	private void goToFirstRightBeeper() {
		while (frontIsClear())move();
		turnAround();
		move();
		turnRight();
		move();
		
	}
	//look at east
	private void lookAtEast() {
		while (notFacingEast())turnLeft();
		
	}
	//fill beeper between 2 marker
	private void fillStage() {
		move();
		while(noBeepersPresent()){
			putBeeper();
			move();
		}
		turnAround();
		
		
		
	}
	// go to right marker position
	private void goToRightBeper() {
		while (beepersPresent()){
			move();
		}
		turnAround();
		if (noBeepersPresent()){
			move();
		}	
		move();
		turnRight();
		move();	
	}
	
	//put left marker
	private void putLeft() {
		move();
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		
	}
	// go to most left beeper
	private void gotoStartPos() {
		turnAround();
		while (frontIsClear())move();
		turnAround();
		
	}
	// fill row
	private void fillRow() {
		putBeeper();
		while (frontIsClear()){
			move();
			putBeeper();
		}
		
	}

}
