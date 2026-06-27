/*
 * MegaBytes Converter
 *
 * Write a method printMegaBytesAndKiloBytes that converts
 * kilobytes into megabytes and remaining kilobytes.
 *
 * If the input is negative, print "Invalid Value".
 *
 * Format:
 * XX KB = YY MB and ZZ KB
 */

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = "
                + megaBytes + " MB and "
                + remainingKiloBytes + " KB");
    }
}
