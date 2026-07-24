/*
 * Floor Class
 *
 * Create a Floor class with width and length.
 * Validate negative values by setting them to 0.
 * Implement a method to calculate and return the floor area.
 */

package Carpet_Cost_Challenge;

public class Floor {

    private double width, length;

    public Floor(double width , double length){
        this.width = width<0 ? 0 : width;
        this.length = length<0 ? 0 : length;
    }

    public double getArea(){
        return width*length;
    }

}