/*
 * Primitive Types Challenge
 *
 * Calculate a long value using
 * byte, short, and int variables.
 */

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long myLong = 50000L + 10L * (myByte + myShort + myInt);

        System.out.println("My long value = " + myLong);
    }
}
