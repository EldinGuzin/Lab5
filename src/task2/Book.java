package task2;

public class Book implements ToBeStored {

	private String writer;
	private String name;
	private double weight;
	
	public Book(String writer, String name, double weight) {
		
		this.writer = writer;
		this.name = name;
		this.weight = weight;
	}
	
	
	
	public double weight() {
		return 0;
	}
	
	@Override
	public String toString() {
		return this.writer + ": " + this.name;
	}
	
}