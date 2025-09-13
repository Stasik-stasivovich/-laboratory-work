import stanford.karel.SuperKarel;


public class Task2 extends SuperKarel {
	public void run(){
		findThePyth();
		while (leftIsClear()){
			goToNextFloor();
			goToStartFloor();
			findThePyth();
			}
	}

	private void findThePyth() {
		while (leftIsBlocked()&&frontIsClear())move();
		
	}

	private void goToStartFloor() {
		turnLeft();
		moveToWall();
		turnAround();
		
	}

	private void moveToWall() {
		while (frontIsClear())move();
		
	}

	private void goToNextFloor() {
		turnLeft();
		move();
		
	}
}
