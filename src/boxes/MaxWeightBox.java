package boxes;

import java.util.Collection;
import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private double maxWeight;
    private ArrayList<Thing> things;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (getWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        } else {
            System.out.println("The thing '" + thing + "' cannot be added to the MaxWeightBox as it exceeds the maximum weight limit.");
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
}