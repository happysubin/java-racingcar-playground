package challenge;

import java.util.Random;

public class RandomUtils {
    public static int generateRandomNumber() {
        Random random = new Random();
        int result = random.nextInt(10);
        return result;
    }
}
