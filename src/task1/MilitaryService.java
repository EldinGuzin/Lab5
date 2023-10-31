package task1;

public class MilitaryService implements NationalService {

	int daysLeft;
	
	public MilitaryService(int daysLeft) {
		this.daysLeft = daysLeft;
	}
	
	public int getDaysLeft() {
		return this.daysLeft;
	}
	
	public void work() {
		return;
	}
}
