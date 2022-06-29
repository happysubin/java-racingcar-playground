package StringAddCalculator;

public class ValidationUtils {
    public static void validate(int num){
        if(num < 0 ) throw new RuntimeException("음수를 입력하면 안됩니다");
    }
}
