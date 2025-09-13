import stanford.karel.SuperKarel;
public class Task1 extends SuperKarel {
	public void run(){
		goToBuildPosition();
		buildLetter();
		goToStartPosition();
	}

	private void goToStartPosition() {
		turnAround();
		for (int i=0;i<3;i++){
			move();
		}
		turnRight();
		makeSixStep();
		turnAround();
		
	}

	private void makeSixStep() {
		for(int i=0;i<6;i++){
			move();
		}
		
	}

	private void buildLetter() {
		putBeeperAndMove();
		turnLeft();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		turnLeft();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		turnLeft();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		putBeeperAndMove();
		turnLeft();
		putBeeperAndMove();
		putBeeper();
		
		
	}

	private void putBeeperAndMove() {
		putBeeper();
		move();
	}

	private void goToBuildPosition() {
		//startPosition is (7,7)
		makeSixStep();
		turnLeft();
		makeSixStep();
	}
}
