/*
 * Animal Class
 *
 * Base class representing a generic animal.
 *
 * Features:
 * 1. Stores common properties such as type, size, and weight.
 * 2. Provides common behaviors like move() and makeNoise().
 * 3. Overrides toString() to display animal details.
 * 4. Acts as the parent class for Dog and Fish.
 */

package specialization;

public class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){
        System.out.println(type +" moves "+ speed);
    }
    public void makeNoise(){
        System.out.println(type+" make some kind of noise.");
    }
}
