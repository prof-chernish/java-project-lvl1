package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int COUNT_ROUNDS = 3;

    public static void playGame(String gameDescription, String[][] questions) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        if (gameDescription.equals("Greeting")) {

            return;

        }

        System.out.println(gameDescription);

        String question;
        String correctAnswer;

        for (int i = 0; i < COUNT_ROUNDS; i++) {

            question = questions[i][0];
            correctAnswer = questions[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(correctAnswer)) {

                System.out.println("Correct!");

            } else {

                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");

                return;

            }

        }

        System.out.println("Congratulations, " + userName + "!");

        scanner.close();

    }

}
