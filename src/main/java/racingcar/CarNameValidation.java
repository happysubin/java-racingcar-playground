package racingcar;

public class CarNameValidation {
    public static boolean validateNameLength(String[] names) {
        for (String name : names) {
            if(name.length() > 5) return false;
        }
        return true;
    }
}
