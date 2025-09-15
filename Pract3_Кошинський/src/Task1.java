import stanford.karel.SuperKarel;
/*Author: Koshynskyi Stanislav / ���������� ��������
 * File: Task1.java
 * ��������� �������� ������ ����� �������. ��� �������� ������������, ����� �� ������ �� �����.
 * ����� ������ � ������ 1�1 � �� �������� � ��������� ������� ����� �������� �� ����.
 * ���� � ���� ����� �� ���� ���������� ������ ����� ��������� ����� ������:
 *����� ������ � ������� 1�1, �������� �� ����
���� ���������� ���� ������������� �� �������� �� �������. � ������������� ����� � �������� ���� ������, ���� ���� ���� ����-��, ���� ���� ���� �� �����. 
���� ���������� ����� ����-��� ������� �����
������ ������ ��������������� � ����-����� ����
����� �� �������� ���� ������ � ��������� ������� ����� ����� ���� �������� �� ����, �� ���� �� �� ���������� �����.
 */

public class Task1 extends SuperKarel {
	public void run(){
		clearRow();
		goToStartFloor();
		findThePyth();
		while (leftIsClear()){
			goToNextFloor();
			goToStartFloor();
			clearRow();
			goToStartFloor();
			findThePyth();
		}
	}
//moves on row and pick all beepers
	private void clearRow() {
		while (frontIsClear()){
			pickBeeperIfContains();
			move();
		}
		pickBeeperIfContains();
		
		
	}
//check if the cell contains beeper and pick it if so
	private void pickBeeperIfContains() {
		if (beepersPresent())pickBeeper();
		
	}
//moves on row and find entrance on next stage
	private void findThePyth() {
		while (leftIsBlocked()){
			if (frontIsClear())move();
			else break;
		}
		
	}
//move to west side and look at east
	private void goToStartFloor() {
		turnAround();
		moveToWall();
		turnAround();
		
	}
//move to wall
	private void moveToWall() {
		while (frontIsClear())move();
		
	}
//move to next stage and look at east
	private void goToNextFloor() {
		turnLeft();
		move();
		turnRight();
		
	}
}
