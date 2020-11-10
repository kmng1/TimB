package sec6;

public class InheritanceAnimals {

    public static void main(String[] args) {
	    sec6.Animal animal = new sec6.Animal("Animal", 1, 1, 5, 5);

        sec6.Dog dog = new sec6.Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
//        dog.eat();
        dog.walk();
//        dog.run();

    }
}
