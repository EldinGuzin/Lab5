package boxes;

public class OneThingBox extends Box {
    private boolean hasThing;
    private Thing thing;

    public OneThingBox() {
        this.hasThing = false;
        this.thing = null;
    }

    @Override
    public void add(Thing thing) {
        if (!hasThing) {
            this.hasThing = true;
            this.thing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return hasThing && this.thing.equals(thing);
    }
}
