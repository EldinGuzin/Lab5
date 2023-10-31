package task1;

public class CivilService implements NationalService {
	
	private int daysLeft;
	
	public CivilService() {
		this.daysLeft = 362; 
	}
	
	public void work() {
		return;
	}
	
	public int getDaysLeft() {
		return this.daysLeft;
	}
}
