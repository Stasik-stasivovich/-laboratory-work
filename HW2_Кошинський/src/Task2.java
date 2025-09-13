import stanford.karel.SuperKarel;


public class Task2 extends SuperKarel {
	public void run(){
		while (true){
			findThePyth();
			if (leftIsClear()){
				goToNextFloor();
				goToStartFloor();

			}
			else break;
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
