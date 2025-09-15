import stanford.karel.SuperKarel;


public class Task1 extends SuperKarel{
	public void run(){
		findDoorAndGoToNewspapaer();
		pickNewspaper();
		goToSrartPosition();
	}

	private void findDoorAndGoToNewspapaer() {
		while (noBeepersPresent()){
			if (frontIsClear()) move();
			else findThePyth();
		}
	}

	private void findThePyth() {
		turnRight();
		while (leftIsBlocked()){
			move();
		}
		turnLeft();
	}

	private void goToSrartPosition() {
		turnAround();
		goToWall();
		turnRight();
		goToWall();
		turnRight();
		
	}

	private void goToWall() {
		while (frontIsClear())move();
		
	}

	private void pickNewspaper() {
		pickBeeper();
		
	}

}
