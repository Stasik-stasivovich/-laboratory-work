import stanford.karel.SuperKarel;


public class Task2 extends SuperKarel {
	public void run(){
		goToNewspaper();
		pickNewspaper();
		goToStartPosition();
	}

	private void goToStartPosition() {
		turnAround();
		makeTwoSteps();
		move();
		turnRight();
		move();
		turnRight();
	}

	private void makeTwoSteps() {
		for(int i=0;i<2;i++){
			move();
		}
		
	}

	private void pickNewspaper() {
		pickBeeper();
		
	}

	private void goToNewspaper() {
		makeTwoSteps();
		turnRight();
		move();
		turnLeft();
		move();
		
		
	}
}
