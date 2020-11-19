package sec7.composition;

/**
 * Created by dev on 16/07/15.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private sec7.composition.Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, sec7.composition.Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public sec7.composition.Resolution getNativeResolution() {
        return nativeResolution;
    }
}
