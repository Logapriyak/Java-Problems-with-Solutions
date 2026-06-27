/*
 * Seconds and Minutes Challenge
 *
 * Convert seconds into minutes and seconds.
 * Convert minutes and seconds into hours,
 * minutes, and seconds.
 */

public class SecondsAndMinutesChallenge {

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "h "
                + remainingMinutes + "m "
                + seconds + "s";
    }
}
