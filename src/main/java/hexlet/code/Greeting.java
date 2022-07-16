package hexlet.code;

import java.util.Scanner;

public class Greeting {
    private static String userName;

    public  static String getUserName() {
        return userName;
    }
    static void greet() {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

    }
}
