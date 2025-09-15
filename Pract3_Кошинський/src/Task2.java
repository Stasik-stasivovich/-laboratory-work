import stanford.karel.SuperKarel;
/*Author: Koshynskyi Stanislav / Кошинський Станіслав
 * File: Task1.java
 * Те ж саме завдання але вертикальний лабіринт
*/
public class Task2 extends SuperKarel {
	public void run(){
		turnLeft();
		clearRow();
		goToStartFloor();
		findThePyth();
		while (rightIsClear()){
			goToNextFloor();
			goToStartFloor();
			clearRow();
			goToStartFloor();
			findThePyth();
		}
		turnRight();
	}
//moves on column and pick all beepers
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
//moves on column and find entrance on next stage
	private void findThePyth() {
		while (rightIsBlocked()){
			if (frontIsClear())move();
			else break;
		}
		
	}
//move to south side and look at north
	private void goToStartFloor() {
		turnAround();
		moveToWall();
		turnAround();
		
	}
//move to wall
	private void moveToWall() {
		while (frontIsClear())move();
		
	}
//move to next stage and look at north
	private void goToNextFloor() {
		turnRight();
		move();
		turnLeft();
		
	}
}
