package hexlet.code.games;

import java.util.Random;

public final class Even implements Game {
    private static String correctAnswer;
    private static final int MAX_VALUE = 100;

    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        Random rnd = new Random();
        int currentValue = rnd.nextInt(MAX_VALUE);
        correctAnswer = currentValue % 2 == 0 ? "yes" : "no";
        return Integer.toString(currentValue);
    }

    @Override
    public boolean isAnswerRight(String answer) {
        return correctAnswer.equals(answer);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
