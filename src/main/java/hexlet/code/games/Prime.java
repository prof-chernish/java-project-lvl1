package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public final class Prime {
    private static String correctAnswer;

    private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                                         31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                                         73, 79, 83, 89, 97, 101, 103, 107, 109,
                                         113, 127, 131, 137, 139, 149, 151, 157,
                                         163, 167, 173, 179, 181, 191, 193, 197,
                                         199, 211, 223, 227, 229, 233, 239, 241,
                                         251, 257, 263, 269, 271, 277, 281, 283,
                                         293, 307, 311, 313, 317, 331, 337, 347,
                                         349, 353, 359, 367, 373, 379, 383, 389,
                                         397, 401, 409, 419, 421, 431, 433, 439,
                                         443, 449, 457, 461, 463, 467, 479, 487,
                                         491, 499, 503, 509, 521, 523, 541};


    private static String getQuestion() {

        int maxPrime = PRIMES[PRIMES.length - 1];
        Random rnd = new Random();
        int currentValue = Math.abs(rnd.nextInt(maxPrime));

        correctAnswer = isPrime(currentValue) ? "yes" : "no";

        return Integer.toString(currentValue);
    }


    private static boolean isPrime(int number) {
        return Arrays.binarySearch(PRIMES, number) >= 0;
    }

    public static void play() {

        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (!Engine.isFinished()) {

            Engine.playRound(getQuestion(), correctAnswer);

        }
    }

}
