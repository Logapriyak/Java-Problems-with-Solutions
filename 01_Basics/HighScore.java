/*
 * High Score Position
 *
 * Write a method to calculate a player's position on the high score list.
 *
 * Position 1 : Score >= 1000
 * Position 2 : Score >= 500
 * Position 3 : Score >= 100
 * Position 4 : Otherwise
 */

public class HighScore {

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position "
                + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;
    }
}
