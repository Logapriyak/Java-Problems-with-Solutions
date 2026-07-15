package getter;

public class Car {

    private String brand = "Tesla";
    private String model = "X model";
    private String color = "Red";
    private int doors = 2;
    private boolean convertible = true;

    public String getBrand(){ // here the variables are non static so then  get method is also non static
        return brand ;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean getConvertible() {
        return convertible;
    }

    public void displayCar() {
        System.out.println(
                doors + "-Doors " + color + " " + brand + " " + model + " " +
                        (convertible ? "Convertible" : "")
        );
    }
}