package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {
    private static int correctAnswer;
    private static final int MAX_VALUE = 30;
    private static final int MAX_DIFFER = 10;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;

    private static String getQuestion() {

        Random rnd = new Random();
        int progressionLength = rnd.nextInt(MIN_LENGTH, MAX_LENGTH + 1);
        int hiddenElementNumber = rnd.nextInt(progressionLength);
        int firstElement = rnd.nextInt(MAX_VALUE);
        int differ = rnd.nextInt(MAX_DIFFER);
        int currentElement = firstElement;
        String question = "";

        for (int i = 0; i < progressionLength; i++) {
            if (i == hiddenElementNumber) {
                question = question + " ..";
                correctAnswer = currentElement;
            } else {
                question = question + " " + currentElement;
            }
            currentElement += differ;

        }

        return question.trim();
    }

    public static void play() {

        Engine.greet();
        System.out.println("What number is missing in the progression?");

        while (!Engine.isFinished()) {

            Engine.playRound(getQuestion(), Integer.toString(correctAnswer));

        }
    }


}
