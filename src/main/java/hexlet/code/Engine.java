package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static final int COUNT_ROUNDS = 3;

    public static String greetAndGetUserName() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        return userName;
    }

    public static int getCountRounds() {
        return COUNT_ROUNDS;
    }


    public static void playGame(String gameDescription, String[] questions, String[] correctAnswers) {

        String userName = greetAndGetUserName();

        System.out.println(gameDescription);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < COUNT_ROUNDS; i++) {

            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(correctAnswers[i])) {

                System.out.println("Correct!");

            } else {

                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");

                return;

            }

        }

        System.out.println("Congratulations, " + userName + "!");

    }

}
