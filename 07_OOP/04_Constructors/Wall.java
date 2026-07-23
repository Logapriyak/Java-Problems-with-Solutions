/*
 * Wall Challenge
 *
 * Create a class named Wall.
 *
 * Requirements:
 * 1. Create two private instance variables:
 *      - width (double)
 *      - height (double)
 * 2. Create a no-argument constructor.
 * 3. Create a constructor with parameters (width, height).
 *    If either parameter is less than 0, set it to 0.
 * 4. Create getter methods:
 *      - getWidth()
 *      - getHeight()
 * 5. Create setter methods:
 *      - setWidth(double width)
 *      - setHeight(double height)
 *    If the value is less than 0, set it to 0.
 * 6. Create a method:
 *      - getArea()
 *    Return the area of the wall (width × height).
 *
 * Concepts Practiced:
 * - Constructors
 * - Constructor Overloading
 * - Encapsulation
 * - Data Validation
 */
public class Wall {
    // write code here
    private double width , height;
    public Wall(){ }

    public Wall(double width, double height){
        setWidth(width);
        setHeight(height);

    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getArea( ){

        return width*height ;
    }

}



