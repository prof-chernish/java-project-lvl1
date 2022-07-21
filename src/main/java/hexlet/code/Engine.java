package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static final int COUNT_ROUNDS = 3;

    public static void greet() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }

    public static int getCountRounds() {
        return COUNT_ROUNDS;
    }


    public static void playGame(String gameDescription, String[] questions, String[] correctAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameDescription);

        for (int i = 0; i < questions.length; i++) {
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
