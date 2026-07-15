package setter;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("Default Values");
        car1.displayCar();

        System.out.println("\nprinting values using setter");
        Car car2 = new Car();
        car2.setBrand("Toyota");
        car2.setColor("Black");
        car2.setDoors(2);
        car2.setModel("Y model");
        car2.setConvertible(true);
        car2.displayCar();

        Car car3 = new Car();

        System.out.println("\nValid Brand");
        car3.setBrand("BMW");
        System.out.println("Brand: "+car3.getBrand());
        car3.displayCar();

        System.out.println("\nNull Brand");
        car3.setBrand(null);
        car3.displayCar();

        System.out.println("\nInvalid Brand: Suzuki");
        car3.setBrand("suzuki");
        car3.displayCar();

    }
}
