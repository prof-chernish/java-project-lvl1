package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Game;


public class Engine {
    private static final int GOAL = 3;
    private static String userName;

    public static void greet() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }

    public static void playGame(Game game) {
        int score = 0;

        greet();

        System.out.println(game.getTask());

        while (score < GOAL) {
            System.out.println("Question: " + game.getQuestion());
            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();

            if (game.isAnswerRight(answer)) {
                System.out.println("Correct!");
                score++;

            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + game.getCorrectAnswer() + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        if (score == GOAL) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
