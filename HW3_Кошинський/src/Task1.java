import stanford.karel.SuperKarel;
/*Author: Koshynskyi Stanislav / ���������� ��������
File : Task1.java
� ����� ������� ������� ������ � ���������� ����� � �������� ������� � ������� ���������� ������������ �� �������� �� ������� �����.
�� ���� ���� �������, �� ���� �������� ���� ���������� ����� � �� ������ ������� �� 8�8. ��������� � ��������� �������� ������ ������� ... �� ������� ��������� �� ����� 5�3
����� ������� ����� �� �������� ���� � ��� ��� �� ��������� 1�1, 1�n, ��� n�1.
*/
public class Task1 extends SuperKarel {
	public void run() {
		putBeeper();
		while (leftIsClear()){
			buildRow();
			moveToRowStart();
			goTheNextLevelAndPutBipperIfEvenRow();
		}
		buildRow();
	}
//go to the next level and look at East and put bipper if even row
	private void goTheNextLevelAndPutBipperIfEvenRow() {
		if (beepersPresent()){
			move();
			turnRight();
		} 
		else{
			move();
			turnRight();
			putBeeper();
		}
		
		
	}
//move to west side at look at north
	private void moveToRowStart() {
		turnAround();
		while(frontIsClear())move();
		turnRight();
		
	}
//build a row that has a beeper through every cell
	private void buildRow() {
		while(frontIsClear()){
			if (beepersPresent()){
				move();
			}
			else{
				move();
				putBeeper();
			}
		}
		
	}
}
