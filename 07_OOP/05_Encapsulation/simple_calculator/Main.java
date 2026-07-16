package simple_calculator;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        // Test Case 1
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("Test Case 1");
        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());
        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Subtraction: " + calculator.getSubtractionResult());

        // Test Case 2
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("\nTest Case 2");
        System.out.println("First Number: " + calculator.getFirstNumber());
        System.out.println("Second Number: " + calculator.getSecondNumber());
        System.out.println("Multiplication: " + calculator.getMultiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());

        // Test Case 3
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(2);

        System.out.println("\nTest Case 3");
        System.out.println("Addition: " + calculator.getAdditionResult());
        System.out.println("Subtraction: " + calculator.getSubtractionResult());
        System.out.println("Multiplication: " + calculator.getMultiplicationResult());
        System.out.println("Division: " + calculator.getDivisionResult());
    }
}