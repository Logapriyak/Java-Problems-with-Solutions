/*
 * Even or Odd Checker
 *
 * Write a method that determines
 * whether a number is even or odd.
 */


public class EvenOddChecker {

    public static void main(String[] args){
        System.out.println(isEvenNumber(22));
        System.out.println(isEvenNumber(55));

    }
    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}