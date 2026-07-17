package Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genric animal","Huge",400);
        doAnimalStuff(animal,"Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");


    }
    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);

        System.out.println("-----------------------");
    }
}
