/*
 * Static Methods Challenge
 *
 * Demonstrates how to create and call static methods in Java.
 *
 * Requirements:
 * 1. Create a Calculator class.
 * 2. Create a static method to add two numbers.
 * 3. Call the static method using the class name.
 * 4. Create another static method in the Main class.
 * 5. Call the Main class static method directly from main().
 *
 * Concepts Covered:
 * - Static Methods
 * - Calling static methods using the class name
 * - Calling static methods within the same class
 */

class Calculator{

public static void Add(int a , int b){
    System.out.println("Sum: " + (a+b));
}

}


public class Static_Method {
    public static void main(String[] args) {
        Calculator.Add(10,30);
        Print();
    }
    public static void Print(){
        System.out.println("hello");
    }

}
