/*
Author : Koshynskyi Stanislav
file Task2.java
� �� ��������� �������� � ����� ����� �� �������� ���� �� ������ 1-� ������ (������� �����). ���� �� �������� � �����, �� ��������� �� ������� �����,
�� ����� �� �������� ������ ������ �� ���� �� ������ ������, �� �� ������� �����.
����� �� ����� �� ������ ������ ���� ����. � ��� ���� �� ���� ������������ �� ������ ������� ����� � ����� ����� �� �����.

��� ������� �������� �� ���� ��������� �� ������� ������ ��� ���:

����� �� �쳺 ��������
����� ������ ������ � ������� 1�1 �������� �� ���� � ����������� ������� �����
���������� ��� �� ������ � ��� � �����
��� ���� ���� ����-����, �� �� ������� ���� ����������, ��� �� ������ �������, �� �� ��������, ����� �� �������, �� � �������
���� ������� ����� �������, ��� ����� �� �������� ���� ���� �� ������, ���� ����� ��� � ���� � ���� ����������� �����
�� �� ������ � ����� �������� ����� �������� � ����., ��� ����'������ ����� �� �����.

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