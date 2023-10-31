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
	
	
	
	public double weight() {
		return 0;
	}
	
}
