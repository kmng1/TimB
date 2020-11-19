package sec7.composition;

/**
 * Created by dev on 16/07/15.
 */
public class Bedroom {
    private String name;
    private sec7.composition.Wall wall1;
    private sec7.composition.Wall wall2;
    private sec7.composition.Wall wall3;
    private sec7.composition.Wall wall4;
    private sec7.composition.Ceiling ceiling;
    private Bed bed;
    private sec7.composition.Lamp lamp;

    public Bedroom(String name, sec7.composition.Wall wall1, sec7.composition.Wall wall2, sec7.composition.Wall wall3, sec7.composition.Wall wall4, sec7.composition.Ceiling ceiling, Bed bed, sec7.composition.Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public sec7.composition.Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
