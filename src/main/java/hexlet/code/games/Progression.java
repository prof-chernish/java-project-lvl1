package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {
    private static final int MAX_VALUE = 30;
    private static final int MAX_DIFFER = 10;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;

    public static void play() {

        String gameDescription = "What number is missing in the progression?";

        int countRounds = Engine.getCountRounds();
        String[] questions = new String[countRounds];
        String[] correctAnswers = new String[countRounds];

        Random rnd = new Random();
        int progressionLength;
        int hiddenElementNumber;
        int firstElement;
        int differ;
        int currentElement;
        String question;
        int correctAnswer = 0;

        for (int i = 0; i < countRounds; i++) {
            progressionLength = rnd.nextInt(MIN_LENGTH, MAX_LENGTH + 1);
            hiddenElementNumber = rnd.nextInt(progressionLength);
            firstElement = rnd.nextInt(MAX_VALUE);
            differ = rnd.nextInt(MAX_DIFFER);
            currentElement = firstElement;
            question = "";

            for (int j = 0; j < progressionLength; j++) {
                if (j == hiddenElementNumber) {
                    question = question + " ..";
                    correctAnswer = currentElement;
                } else {
                    question = question + " " + currentElement;
                }
                currentElement += differ;

            }

            questions[i] = question.trim();

            correctAnswers[i] = Integer.toString(correctAnswer);

        }

        Engine.playGame(gameDescription, questions, correctAnswers);

    }



}
