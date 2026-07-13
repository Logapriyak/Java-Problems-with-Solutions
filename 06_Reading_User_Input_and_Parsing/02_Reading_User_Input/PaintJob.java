/*
 * Paint Job Calculator
 *
 * Calculates the number of paint buckets Bob needs to buy.
 *
 * Concepts Used:
 * - Method Overloading
 * - Input Validation
 * - Math.ceil()
 *
 * Methods:
 * 1. getBucketCount(width, height, areaPerBucket, extraBuckets)
 *    - Calculates the number of buckets to buy when Bob already has extra buckets.
 *
 * 2. getBucketCount(width, height, areaPerBucket)
 *    - Calculates the number of buckets to buy when Bob has no extra buckets.
 *
 * 3. getBucketCount(area, areaPerBucket)
 *    - Calculates the required buckets when only the wall area is known.
 */

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        // Validate input
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        // Calculate wall area
        double wallArea = width * height;

        // Calculate the total buckets required
        int requiredBucket = (int) Math.ceil(wallArea / areaPerBucket);

        // Calculate the number of buckets to buy
        int toBuy = requiredBucket - extraBuckets;

        // Bob already has enough buckets
        if (toBuy < 0) {
            return 0;
        }

        return toBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        // Validate input
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        // Calculate the required buckets
        return (int) Math.ceil(area / areaPerBucket);
    }

    // Test the overloaded methods
    public static void main(String[] args) {

        System.out.println("===== Method 1 =====");
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));      // Expected: 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));    // Expected: 3
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));     // Expected: -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, -2));     // Expected: -1

        System.out.println("\n===== Method 2 =====");
        System.out.println(getBucketCount(3.4, 2.1, 1.5));         // Expected: 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35));       // Expected: 14
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));        // Expected: -1
        System.out.println(getBucketCount(3.4, -2.1, 1.5));        // Expected: -1

        System.out.println("\n===== Method 3 =====");
        System.out.println(getBucketCount(3.4, 1.5));              // Expected: 3
        System.out.println(getBucketCount(6.26, 2.2));             // Expected: 3
        System.out.println(getBucketCount(3.26, 0.75));            // Expected: 5
        System.out.println(getBucketCount(-3.4, 1.5));             // Expected: -1
        System.out.println(getBucketCount(3.4, -1.5));             // Expected: -1
    }
}