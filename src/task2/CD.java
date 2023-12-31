package task2;

public class CD implements ToBeStored {

	private String artist;
	private String title;
	private int publishingYear;
	
	public CD(String artist, String title, int publishingYear) {
		this.artist = artist;
		this.title = title;
		this.publishingYear = publishingYear;
	}
	
	
	@Override
	public double getWeight() {
		return 0;
	}
	
	@Override
	public String toString() {
		return this.artist + ": " + this.title + "(" + this.publishingYear + ")";
	}
}
