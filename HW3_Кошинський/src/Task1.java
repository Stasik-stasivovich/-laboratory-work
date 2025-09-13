import stanford.karel.SuperKarel;
/*Author: Koshynskyi Stanislav / Кошинський Станіслав
File : Task1.java
В цьому завданні задачею Карела є розставити біпери в шаховому порядку в середині порожнього прямокутника як показано на малюнку нижче.
Ви маєте бути впевнені, що ваша програма вірно розставляє біпери і на дошках відмінних від 8х8. Працювати з непарними розмірами досить складно ... як приклад погляньте на дошку 5х3
Також зверніть увагу на ситуацію коли у вас світ має розмірність 1х1, 1хn, або nх1.
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
