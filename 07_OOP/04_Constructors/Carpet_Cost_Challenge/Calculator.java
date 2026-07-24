/*
 * Calculator Class
 *
 * Create a Calculator class using composition (HAS-A relationship).
 * Store Floor and Carpet objects using a constructor.
 * Calculate the total carpet cost using:
 *
 * Total Cost = Floor Area × Carpet Cost
 */

package Carpet_Cost_Challenge;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor , Carpet carpet){
        this.floor = floor;
        this.carpet= carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
