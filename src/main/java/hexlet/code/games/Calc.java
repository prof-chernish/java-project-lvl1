package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class Calc {
    private static final int MAX_VALUE = 50;

    private static final String GAME_DESCRIPTION = "What is the result of the expression?";

    public static void play() {

        int countRounds = Engine.COUNT_ROUNDS;
        String[][] questions = new String[countRounds][2];

        String[] operators = {"+", "-", "*"};
        int operatorNumber;
        int firstValue;
        int secondValue;
        String operator;
        int correctAnswer;

        for (int i = 0; i < countRounds; i++) {

            operatorNumber = Utils.getRandomValue(operators.length);
            operator = operators[operatorNumber];
            firstValue = Utils.getRandomValue(MAX_VALUE);
            secondValue = Utils.getRandomValue(MAX_VALUE);

            correctAnswer = calculate(firstValue, secondValue, operator);

            questions[i][0] = firstValue + " " + operator + " " + secondValue;
            questions[i][1] = Integer.toString(correctAnswer);

        }

        Engine.playGame(GAME_DESCRIPTION, questions);

    }

    private static int calculate(int firstValue, int secondValue, String operator) {

        switch (operator) {

            case "+":
                return firstValue + secondValue;

            case "*":
                return firstValue * secondValue;

            case "-":
                return firstValue - secondValue;

            default: throw new RuntimeException("Undefined operator!");
        }

    }

}
