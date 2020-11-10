package sec6;

// import sec6.Car;

public class ClassCar1 {

    public static void main(String[] args) {
        Car1 porsche = new Car1();
        Car1 holden = new Car1();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
