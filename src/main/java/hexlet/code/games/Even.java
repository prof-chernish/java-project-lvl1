package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even {
    private static String correctAnswer;
    private static final int MAX_VALUE = 100;

    private static String getQuestion() {

        Random rnd = new Random();
        int currentValue = rnd.nextInt(MAX_VALUE);

        correctAnswer = currentValue % 2 == 0 ? "yes" : "no";

        return Integer.toString(currentValue);
    }

    public static void play() {

        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while (!Engine.isFinished()) {

            Engine.playRound(getQuestion(), correctAnswer);

        }
    }
}
