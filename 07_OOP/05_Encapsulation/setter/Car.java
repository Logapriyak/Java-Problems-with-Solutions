package setter;
public class Car {

    private String brand = "Tesla";
    private String model = "X model";
    private String color = "Red";
    private int doors = 2;
    private boolean convertible = true;

    public String getBrand() {
        return brand;
    }

    public  void setBrand(String brand){// we can also validate
        if (brand == null ) brand = "unknown";
        String lowercase = brand.toLowerCase();
        switch (lowercase){
            case "tesla", "hyundai", "toyota","bmw" -> this.brand =brand ;
            default -> this.brand = "NotSupported" ;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void displayCar() {
        System.out.println(
                doors + "-Doors " + color + " " + brand + " " + model + " " +
                        (convertible ? "Convertible" : "")
        );
    }
}
