package challenge;

import java.util.Random;

public class RandomUtils {

    private static final int BOUND = 10;

    public static int generateRandomNumber() {
        Random random = new Random();
        int result = random.nextInt(BOUND);
        return result;
    }
}
