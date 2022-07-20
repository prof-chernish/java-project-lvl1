package hexlet.code;

import java.util.Scanner;


public class Engine {
    private static final int GOAL = 3;
    private static String userName;
    private static int score = 0;
    private static boolean isFinished;

    public static void greet() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }

    public static boolean isFinished() {
        return isFinished;
    }

    public static void playRound(String question, String correctAnswer) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'" + ".");
            System.out.println("Let's try again, " + userName + "!");

            isFinished = true;
        }

        if (score == GOAL) {
            isFinished = true;
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
