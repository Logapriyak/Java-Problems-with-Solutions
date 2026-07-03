public class NestedIfPositiveEven {

    public static void main(String[] args) {

        int number = 18;

        if (number > 0) {

            if (number % 2 == 0) {
                System.out.println(number + " is a Positive Even Number");
            } else {
                System.out.println(number + " is a Positive Odd Number");
            }

        } else {
            System.out.println("Number is not positive");
        }
    }
}
