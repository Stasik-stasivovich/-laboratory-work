import stanford.karel.SuperKarel;
public class Task3 extends SuperKarel {
	public void run(){
		while(frontIsClear()){
			repairColumn();
			moveToColumnBottom();
			goToNextColumn();
		}
		repairColumn();
		moveToColumnBottom();
	}

	private void moveToColumnBottom() {
		turnAround();
		while(frontIsClear()){
			move();
		}
		turnLeft();
	}

	private void goToNextColumn() {
		for (int i =0;i<4;i++){
			move();
		}
		
	}

	private void repairColumn() {
		turnLeft();
		while(frontIsClear()){
			repairCellIfNeed();
			move();
		}
		repairCellIfNeed();
		
		
	}

	private void repairCellIfNeed() {
		if(noBeepersPresent())putBeeper();
	}
}
