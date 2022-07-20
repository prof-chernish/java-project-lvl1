package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc {
    private static int correctAnswer;
    private static final int MAX_VALUE = 20;
    private static final int OPERATIONS_NUMBER = 3;

    private static String getQuestion() {

        Random rnd = new Random();
        int operatorNumber = rnd.nextInt(OPERATIONS_NUMBER);
        int firstValue = rnd.nextInt(MAX_VALUE);
        int secondValue = rnd.nextInt(MAX_VALUE);
        String operator = "";

        switch (operatorNumber) {
            case 0: operator = "+";
                correctAnswer = firstValue + secondValue;
                break;
            case 1: operator = "*";
                correctAnswer = firstValue * secondValue;
                break;
            case 2: operator = "-";
                correctAnswer = firstValue - secondValue;
                break;
            default: break;
        }

        return firstValue + " " + operator + " " + secondValue;
    }

    public static void play() {

        Engine.greet();
        System.out.println("What is the result of the expression?");

        while (!Engine.isFinished()) {

            Engine.playRound(getQuestion(), Integer.toString(correctAnswer));

        }
    }
}
