package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class GCD {
    private static final int MAX_VALUE = 100;

    public static void play() {

        String gameDescription = "Find the greatest common divisor of given numbers.";

        int countRounds = Engine.getCountRounds();
        String[] questions = new String[countRounds];
        String[] correctAnswers = new String[countRounds];

        Random rnd = new Random();
        int firstValue;
        int secondValue;
        int correctAnswer;

        for (int i = 0; i < countRounds; i++) {

            firstValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;
            secondValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;
            correctAnswer = gcd(firstValue, secondValue);

            questions[i] = firstValue + " " + secondValue;
            correctAnswers[i] = Integer.toString(correctAnswer);
        }

        Engine.playGame(gameDescription, questions, correctAnswers);

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
