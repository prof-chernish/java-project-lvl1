package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;


public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1" -> Engine.greet();
            case "2" -> Engine.playGame(new Even());
            case "3" -> Engine.playGame(new Calc());
            case "4" -> Engine.playGame(new GCD());
            case "5" -> Engine.playGame(new Progression());
            default -> {
            }
        }
    }
}
