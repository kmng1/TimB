package sec7.composition;

public class House {

    public static void main(String[] args) {
        sec7.composition.Dimensions dimensions = new sec7.composition.Dimensions(20, 20, 5);
        sec7.composition.Case theCase = new sec7.composition.Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new sec7.composition.Resolution(2540, 1440));

        sec7.composition.Motherboard theMotherboard = new sec7.composition.Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        sec7.composition.PC thePC = new sec7.composition.PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        sec7.composition.Wall wall1 = new sec7.composition.Wall("West");
        sec7.composition.Wall wall2 = new sec7.composition.Wall("East");
        sec7.composition.Wall wall3 = new sec7.composition.Wall("South");
        sec7.composition.Wall wall4 = new sec7.composition.Wall("North");

        sec7.composition.Ceiling ceiling = new sec7.composition.Ceiling(12, 55);

        sec7.composition.Bed bed = new sec7.composition.Bed("Modern", 4, 3, 2, 1);

        sec7.composition.Lamp lamp = new sec7.composition.Lamp("Classic", false, 75);

        sec7.composition.Bedroom bedRoom = new sec7.composition.Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
