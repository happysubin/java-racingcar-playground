package StringAddCalculator;

public class StringAddCalculator {
    public int calculate(String s) {
        if(stringIsNull(s) || s.isEmpty()) return 0;

        return Integer.parseInt(s);
    }

    private boolean stringIsNull(String s){
        if(s == null) return true;
        return false;
    }
}
