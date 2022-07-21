package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Calc {
    private static final int MAX_VALUE = 20;
    private static final int OPERATIONS_NUMBER = 3;

    public static void play() {

        String gameDescription = "What is the result of the expression?";

        int countRounds = Engine.getCountRounds();
        String[] questions = new String[countRounds];
        String[] correctAnswers = new String[countRounds];


        Random rnd = new Random();
        int operatorNumber;
        int firstValue;
        int secondValue;
        String operator = "";
        int correctAnswer = 0;

        for (int i = 0; i < countRounds; i++) {

            operatorNumber = rnd.nextInt(OPERATIONS_NUMBER);
            firstValue = rnd.nextInt(MAX_VALUE);
            secondValue = rnd.nextInt(MAX_VALUE);

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

            questions[i] = firstValue + " " + operator + " " + secondValue;
            correctAnswers[i] = Integer.toString(correctAnswer);
        }

        Engine.playGame(gameDescription, questions, correctAnswers);


    }

}
