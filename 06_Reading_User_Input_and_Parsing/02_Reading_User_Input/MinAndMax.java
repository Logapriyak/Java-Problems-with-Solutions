/*
 * Challenge: Minimum and Maximum Number
 *
 * Write a program that continuously reads numbers entered by the user.
 *
 * Requirements:
 * 1. Use a Scanner to read user input.
 * 2. Accept decimal numbers (double).
 * 3. Continue reading input until:
 *    - the user enters a negative number, or
 *    - the user enters a non-numeric value.
 * 4. Keep track of the minimum and maximum numbers entered.
 * 5. If at least one valid number is entered, display:
 *      Min = <minimum value>
 *      Max = <maximum value>
 * 6. If no valid numbers are entered, display:
 *      "No valid data entered"
 */


import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0;
        double max = 0;
        int count = 0;
        while (true) {
            System.out.println("enter a number or any character to exit");
            String num = sc.nextLine();
            try {
                double number = Double.parseDouble(num);
                if(number < 0) {
                    break;
                }
                if( count==0 || number < min){
                    min= number;
                }
                if ( count==0 || number > max){
                    max = number;
                }
                count++ ;
            } catch (NumberFormatException e){
                break;
            }
        }
        if(count > 0) {
            System.out.println(" Min = " + min + " Max = " + max);
        }
        else {
            System.out.println("No valid data entered ");
        }
    }
}


