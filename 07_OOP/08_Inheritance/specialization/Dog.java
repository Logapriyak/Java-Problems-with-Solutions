/*
 * Dog Class
 *
 * Demonstrates inheritance, constructor chaining,
 * method overriding, and specialized behavior.
 *
 * Features:
 * 1. Inherits common fields and methods from Animal.
 * 2. Adds dog-specific fields: earShape and tailShape.
 * 3. Uses constructor chaining with this() and super().
 * 4. Overrides move() to simulate walking or running.
 * 5. Overrides makeNoise() for dog and wolf sounds.
 * 6. Includes private helper methods such as bark(), walk(),
 *    run(), and wagTail().
 * 7. Overrides toString() to include parent and child details.
 */

package specialization;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt", "small",20);
    }

    public Dog(String type,double weight) {
       this(type,weight,"Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : (weight< 35) ? "Medium" : "large" ,
            weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} "+ super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow"){
            walk();
            wagTail();
        }else{
            bark();
            run();
        }
        System.out.println();

    }

    @Override
    public void makeNoise() {
        if(type=="wolf"){
            System.out.print("Ow Woooo! ");
        }
        bark();
        System.out.println();
    }

    private void bark(){
        System.out.print("Dog Barking ");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("Tail Wagging ");
    }

}
