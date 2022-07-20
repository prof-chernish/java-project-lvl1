package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class GCD {
    private static int correctAnswer;

    private static final int MAX_VALUE = 100;

    private static String getQuestion() {

        Random rnd = new Random();
        int firstValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;
        int secondValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;

        correctAnswer = gcd(firstValue, secondValue);

        return firstValue + " " + secondValue;
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

    public static void play() {

        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        while (!Engine.isFinished()) {

            Engine.playRound(getQuestion(), Integer.toString(correctAnswer));

        }
    }
}
