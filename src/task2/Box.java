package task2;

import java.util.ArrayList;

public class Box implements ToBeStored {

	private double maxWeight;
	private ArrayList<ToBeStored> things;
	
	
	public Box(double maxWeight) {
		this.maxWeight = maxWeight;
		this.things = new ArrayList<>();
		
	}


	@Override
	public double getWeight() {
		double totalWeight = 0;
		for(ToBeStored item : things) {
			totalWeight += item.getWeight();
		}
		return totalWeight;
	}
	
	public void add(ToBeStored item) {
		
		if (item.getWeight() <= maxWeight) {
			things.add(item);
		}
		else {
			System.out.println("The item " + item + " cannot be added to the box");
		}
	}
	
	@Override
	public String toString() {
		int numItems = things.size();
		double totalWeight = getWeight();
		return "Box: " + numItems + " things, total weight: " + totalWeight + "kg";
	}
	
	
	
}
