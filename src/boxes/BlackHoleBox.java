package boxes;

public class BlackHoleBox extends Box {

	public BlackHoleBox() {
		
	}
	
	
	
	
	
	@Override
	public void add(Thing thing) {
		// It does nothing
		
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		// Always returns false as requested.
		return false;
	}

}
