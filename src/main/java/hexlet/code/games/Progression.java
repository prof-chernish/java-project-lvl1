package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final int MAX_VALUE = 30;
    private static final int MAX_DIFFER = 10;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_LENGTH = 5;

    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";

    public static void play() {

        int countRounds = Engine.COUNT_ROUNDS;
        String[][] questions = new String[countRounds][2];

        int progressionLength;
        int hiddenElementNumber;
        int firstElement;
        int differ;
        String question;
        int[] progression;
        int correctAnswer;

        for (int i = 0; i < countRounds; i++) {

            progressionLength = Utils.getRandomValue(MIN_LENGTH, MAX_LENGTH + 1);
            hiddenElementNumber = Utils.getRandomValue(progressionLength);
            firstElement = Utils.getRandomValue(MAX_VALUE);
            differ = Utils.getRandomValue(MAX_DIFFER);

            progression = createProgression(progressionLength, firstElement, differ);
            correctAnswer = progression[hiddenElementNumber];
            question = "";

            for (int j = 0; j < progressionLength; j++) {

                if (j == hiddenElementNumber) {
                    question = question + " ..";

                } else {

                    question = question + " " + progression[j];

                }

            }

            questions[i][0] = question.trim();
            questions[i][1] = Integer.toString(correctAnswer);

        }

        Engine.playGame(GAME_DESCRIPTION, questions);

    }

    private static int[] createProgression(int progressionLength, int firstElement, int differ) {

        int[] progression = new int[progressionLength];

        for (int i = 0; i < progressionLength; i++) {

            progression[i] = firstElement + i * differ;

        }

        return progression;
    }

}
