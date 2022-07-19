package hexlet.code.games;

import java.util.Random;

public final class GCD implements Game {
    private int correctAnswer;

    private static final int MAX_VALUE = 100;
    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        Random rnd = new Random();

        int firstValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;
        int secondValue = Math.abs(rnd.nextInt(MAX_VALUE)) + 1;

        correctAnswer = gcd(firstValue, secondValue);

        return firstValue + " " + secondValue;
    }

    @Override
    public boolean isAnswerRight(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }

    @Override
    public String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }

    private static int gcd(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;

        }
        return b;
    }
}
