/*
 * Inheritance Demonstration
 *
 * Demonstrates inheritance, constructor chaining,
 * and method overriding using Animal, Dog, and Fish.
 *
 * Features:
 * 1. Creates Animal, Dog, and Fish objects.
 * 2. Demonstrates constructor overloading and chaining.
 * 3. Passes child objects to a method expecting an Animal reference.
 * 4. Calls overridden methods like move() and makeNoise().
 * 5. Displays object details using toString().
 */


package specialization;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genric animal","Huge",400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog dog2 = new Dog("Yorki",  20);
        doAnimalStuff(dog2,"slow");

        Dog dog3 = new Dog("Retriever",30 ,"Floppy","Swimmer");
        doAnimalStuff(dog3,"fast");

        Dog wolf = new Dog("wolf",65);
        doAnimalStuff(wolf,"slow");

        Fish fish1 = new Fish("Golden fish", 0.25,3,2);
        doAnimalStuff(fish1,"slow");


        Fish fish2 = new Fish("Star fish", 0.25,4,3);
        doAnimalStuff(fish2,"fast");

    }
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);

        System.out.println("------------------------------------");
    }
}

