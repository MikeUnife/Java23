/**
 * orologio
 */
public class Orologio {
    private Counter ore, min;

    public Orologio() {
        ore = new Counter();
        min = new Counter();
    }

    public void reset() {
        ore.reset();
        min.reset();
    }

    public void tic() {
        min.inc();
        if (min.getValue() == 60) {
            ore.inc();
            min.reset();
        }
        if (ore.getValue() == 24) {
            reset();
        }
    }

    public int getOre() {
        return ore.getValue();
    }

    public int getMin() {
        return min.getValue();
    }

}