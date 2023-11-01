package boxes;
import java.util.*;

public class Thing extends Box {

	private String name;
	private double weight;
	
	
	public Thing(String name, double weight) {
		
		this.name = name;
		if(weight < 0 ) {
			throw new IllegalArgumentException("Weight cannot be negative.");
		}
		this.weight = weight;
	}
	
	public Thing(String name) {
		this.name = name;
	}
	
	
	
	
	@Override
	public void add(Thing thing) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isInTheBox(Thing thing) {
		
		return false;
	}
	
	@Override
	public boolean equals(Object o ) {
		if(this == o) return true;
		if(o== null || getClass() != o.getClass()) return false;
		Thing thing = (Thing) o;
		return Objects.equals(name, thing.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}




	public double getWeight() {
		
		return this.weight;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
