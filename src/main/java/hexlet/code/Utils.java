package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RND = new Random();

    public static int getRandomValue(int maxValue) {

        return RND.nextInt(maxValue);
    }

    public static int getRandomValue(int minValue, int maxValue) {

        return RND.nextInt(minValue, maxValue);

    }
}
