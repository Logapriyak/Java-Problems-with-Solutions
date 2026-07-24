/*
 * Carpet Class
 *
 * Create a Carpet class with a cost field.
 * Validate negative cost values by setting them to 0.
 * Implement a method to return the carpet cost.
 */


package Carpet_Cost_Challenge;

public class Carpet {
    private double cost;

    public Carpet(double cost){
        this.cost = cost<0 ? 0 : cost;
    }

    public double getCost(){
        return cost;
    }
}
