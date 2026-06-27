/*
 * Method Overloading
 *
 * Problem:
 * Create overloaded methods named calculateScore().
 *
 * 1. calculateScore(String playerName, int score)
 *    - Print the player's name and score.
 *    - Return score × 1000.
 *
 * 2. calculateScore(int score)
 *    - Call the first method using "Anonymous" as the player name.
 *
 * 3. calculateScore()
 *    - Print "No player name, no player score".
 *    - Return 0.
 *
 * This example demonstrates method overloading and
 * code reusability by calling one overloaded method
 * from another.
 */

public class MethodOverloading {

    public static void main(String[] args) {

        int newScore = calculateScore("Priya", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName +
                " scored " + score + " points");

        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");

        return 0;
    }
}
