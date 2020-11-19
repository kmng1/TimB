package sec7.composition;

/**
 * Created by dev on 16/07/15.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private sec7.composition.Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, sec7.composition.Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public sec7.composition.Dimensions getDimensions() {
        return dimensions;
    }
}
