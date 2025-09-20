/*

Author : Koshynskyi Stanislav
file Task1.java
����� ��� �������� ���� ������ ��������� ��������� � ����������� (���� ��� ������� ������ �� ���� ���� ������� ����� ����������, ��� ����'���� ��� ����������).

		����, ����� ������ �� ����� ����� ����������.



		�������� ������ ������������ � ������� ���������� ������� ����� ������ �����������. ������ ���, �� �� ���������� ��������� ��� ��������� ����������� �� ������� ���� ����.

		�� ����������� ����������� �������� ����������, �� ������� ���������. �� ������������ �������� �� �� �������� �� ������� � ��������� 2 �� 8.

		���� �������� ���� ������������� ����� ���, �� �� ��������� �� ����� �� � ��������� 4. ��� ������ ��� �����������, �� ������ ������ ��������� ������� � ����� ���������� �� ���� �� � ��������� 6. ��� �������� � ��������� 10, �� ���� ���� � ������������ ���� ���������� � ������� �� ������ 10,2 � ����� � �� ����������� ��� �����.

		������� ������, �� �� ������������� ��� ���� �������, �� ���� � ���������� ������ ���� ����������� �� �������� ������ ����� ������ ��������� � ����� �� �������� ���� ���� ����� � �������, �� �� ��������� �� ������� �����:



		����� �� ��������� �� ������� ������:

		��� ���������� � ������ ����� ������������ ��� �����������
		������������ ��� ����������� ���������� ����� ������� ����������
		������������ ��� ����������� ���� ���� ����� (��� �����) �� ��������� �� �������
		��� ���������� ������� ���������� � ���������� ������� ����������
		������������ �� ������ ����������� � ����� ������ (������ ������������ ���� ���� �����)
		����� ������ ������ ������ ���� �� ������� ������������ ��� �����������, ������� �� ����, � �����, �� ��������� ����� �� ������������
		����� �� �������� ������ �������� �� ���� � ���������� ��������� ����������
		�������� �������� � ��� ����� ������� ����������. ���'������, �� ���������� ���� ���� ����� �� ��������� �� �������.



*/




import stanford.karel.SuperKarel;


public class Task1 extends SuperKarel{
	public void run(){
		move();
		if (noBeepersPresent()){
			clearColumn();
			goToMidle();
		}
		if (beepersPresent()){
			clearColumn();
			buildColumn();
			goToMidleFromBot();
		}
		while (frontIsClear()){
			move();
			if (frontIsClear()){
				move();
				if (noBeepersPresent()){
					clearColumn();
					goToMidle();
				}
				if (beepersPresent()){
					clearColumn();
					buildColumn();
					goToMidleFromBot();
				}
			}
		}
		
	}
private void buildColumn() {
		turnAround();
		while (frontIsClear()){
			putBeeper();
			move();
		}
		putBeeper();
		
	}
private void goToMidleFromBot() {
	turnAround();
	while (rightIsBlocked()){
		move();
	}
	turnRight();
	
}
//��� �� ������ �������
	private void goToMidle() {
		turnAround();
		while (leftIsBlocked())move();
		turnLeft();
		
	}
//clear column
	private void clearColumn() {
		turnRight();
		pickAllBeperInFront();
		turnAround();
		pickAllBeperInFront();
			}
//pick all beeper in front
	private void pickAllBeperInFront() {
		while(frontIsClear()){
			while (beepersPresent())pickBeeper();
		move();
		while (beepersPresent())pickBeeper();
	
		}
		
	}

}
