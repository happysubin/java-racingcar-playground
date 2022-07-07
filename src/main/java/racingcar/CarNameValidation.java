package racingcar;

public class CarNameValidation {
    public static boolean NameLengthIsMoreThan5(String[] names) {
        for (String name : names) {
            if(name.length() > 5) return true;
        }
        return false;
    }
}
