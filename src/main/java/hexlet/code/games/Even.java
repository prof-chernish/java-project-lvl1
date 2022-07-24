package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final int MAX_VALUE = 100;

    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {

        int countRounds = Engine.COUNT_ROUNDS;
        String[][] questions = new String[countRounds][2];

        String correctAnswer;
        int currentValue;

        for (int i = 0; i < countRounds; i++) {

            currentValue = Utils.getRandomValue(MAX_VALUE);
            correctAnswer = isEven(currentValue) ? "yes" : "no";

            questions[i][0] = Integer.toString(currentValue);
            questions[i][1] = correctAnswer;
        }

        Engine.playGame(GAME_DESCRIPTION, questions);

    }

    private static boolean isEven(int number) {

        return number % 2 == 0;

    }

}
