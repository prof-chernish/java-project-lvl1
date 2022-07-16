package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int GOAL = 3;
    private static final int MAX_VALUE = 100;
    static void game() {
        Greeting.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        int score = 0;

        while (score < GOAL) {
            int currentNumber = rnd.nextInt(MAX_VALUE);

            System.out.println("Question: " + currentNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            String correctAnswer = currentNumber % 2 == 0 ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'" + ".");
                System.out.println("Let's try again, " + Greeting.getUserName() + "!");
                break;
            }
        }

        if (score == GOAL) {
            System.out.println("Congratulations, " + Greeting.getUserName() + "!");
        }

    }
}
