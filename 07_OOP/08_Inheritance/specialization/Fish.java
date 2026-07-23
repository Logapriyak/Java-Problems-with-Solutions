/*
 * Fish Class
 *
 * Demonstrates inheritance and method overriding
 * with fish-specific behavior.
 *
 * Features:
 * 1. Inherits common properties from Animal.
 * 2. Adds fish-specific fields: gills and fins.
 * 3. Overrides move() to simulate swimming.
 * 4. Uses private helper methods to move muscles
 *    and back fin.
 * 5. Overrides toString() to display fish details
 *    along with inherited Animal information.
 */

package specialization;

public class Fish extends Animal{

    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills , int fins){
        super(type,"small",weight);
        this.gills=gills;
        this.fins= fins;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }


    private void moveMuscles(){
        System.out.print("Muscles Moving ");
    }

    private void moveBackFin(){
        System.out.print("Backfin Moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }
}
