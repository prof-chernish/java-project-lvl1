package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static final int MAX_VALUE = 100;

    public static void play() {

        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        int countRounds = Engine.getCountRounds();
        String[] questions = new String[countRounds];
        String[] correctAnswers = new String[countRounds];

        Random rnd = new Random();
        String correctAnswer;
        int currentValue;

        for (int i = 0; i < countRounds; i++) {

            currentValue = rnd.nextInt(MAX_VALUE);
            correctAnswer = currentValue % 2 == 0 ? "yes" : "no";

            questions[i] = Integer.toString(currentValue);
            correctAnswers[i] = correctAnswer;
        }

        Engine.playGame(gameDescription, questions, correctAnswers);

    }

}
