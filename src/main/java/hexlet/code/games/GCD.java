package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {
    private static final int MAX_VALUE = 100;

    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void play() {

        int countRounds = Engine.COUNT_ROUNDS;
        String[][] questions = new String[countRounds][2];

        int firstValue;
        int secondValue;
        int correctAnswer;

        for (int i = 0; i < countRounds; i++) {

            firstValue = Math.abs(Utils.getRandomValue(MAX_VALUE)) + 1;
            secondValue = Math.abs(Utils.getRandomValue(MAX_VALUE)) + 1;
            correctAnswer = gcd(firstValue, secondValue);

            questions[i][0] = firstValue + " " + secondValue;
            questions[i][1] = Integer.toString(correctAnswer);

        }

        Engine.playGame(GAME_DESCRIPTION, questions);

    }


    private static int gcd(int a, int b) {

        int remainder = a % b;

        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;

        }

        return b;
    }

}
