package getter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayCar();
        System.out.println("Brand: "+ car.getBrand());
        System.out.println("Color: "+car.getColor());
        System.out.println("Doors: "+car.getDoors());
        System.out.println("Model: "+ car.getModel());
        System.out.println("Is convertible: "+ car.getConvertible());
    }
}
