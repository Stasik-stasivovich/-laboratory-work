import stanford.karel.SuperKarel;


public class Task1 extends SuperKarel{
	public void run(){
		findDoorAndGoToNewspapaer();
		pickNewspaper();
		goToSrartPosition();
	}

	private void findDoorAndGoToNewspapaer() {
		while(frontIsClear() && noBeepersPresent())move();
		if (noBeepersPresent()){
			turnRight();
			findDoor();
			turnLeft();
			move();
			
		}
	}

	private void findDoor() {
		while (leftIsBlocked())move();
		
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
