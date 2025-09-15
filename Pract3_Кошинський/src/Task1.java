import stanford.karel.SuperKarel;
/*Author: Koshynskyi Stanislav / Кошинський Станіслав
 * File: Task1.java
 * Необхідно провести Карела через лабіринт. Але завдання ускладнилося, Карел має зібрати усі біпери.
 * Карел починає з клітини 1х1 і має закінчити в верхньому правому кутку обличчам на схід.
 * Світи в яких Карел має вірно виконувати задачу мають відповідати таким умовам:
 *Карел починає з клітинки 1х1, обличчям на схід
Стіни розташовані лише горизонтально як показано на малюнку. В горизонтальній стінці є принаймні один прохід, який може бути будь-де, якщо його немає це кінець. 
Стіни розташовані через будь-яку кількість рядків
Біпери можуть розташовуватися в будь-якому місці
Карел має закінчити свою роботу в верхньому правому кутку свого світу обличчям на схід, на карті не має залишитися біперів.
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
