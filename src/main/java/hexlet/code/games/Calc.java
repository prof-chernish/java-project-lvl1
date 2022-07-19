package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    private int correctAnswer;
    private static final int MAX_VALUE = 20;
    private static final int OPERATIONS_NUMBER = 3;

    @Override
    public String getTask() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {

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
        return firstValue + operator + secondValue;
    }

    @Override
    public boolean isAnswerRight(String answer) {
        return Integer.parseInt(answer) == correctAnswer;
    }

    @Override
    public String getCorrectAnswer() {
        return Integer.toString(correctAnswer);
    }
}
