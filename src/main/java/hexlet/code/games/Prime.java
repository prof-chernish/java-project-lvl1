package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static final int MAX_VALUE = 500;

    private static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {

        int countRounds = Engine.COUNT_ROUNDS;
        String[][] questions = new String[countRounds][2];

        int currentValue;
        String correctAnswer;

        for (int i = 0; i < countRounds; i++) {

            currentValue = Math.abs(Utils.getRandomValue(MAX_VALUE));
            correctAnswer = isPrime(currentValue) ? "yes" : "no";

            questions[i][0] = Integer.toString(currentValue);
            questions[i][1] = correctAnswer;

        }

        Engine.playGame(GAME_DESCRIPTION, questions);

    }


    private static boolean isPrime(int number) {

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }


}
