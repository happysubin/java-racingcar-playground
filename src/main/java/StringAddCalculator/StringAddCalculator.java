package StringAddCalculator;

public class StringAddCalculator {

    private final SeparationUtils separationUtils;

    public StringAddCalculator(SeparationUtils separationUtils) {
        this.separationUtils = separationUtils;
    }

    public int calculate(String s) {
        if(stringIsNull(s) || s.isEmpty()) return 0;

        else if(s.startsWith("//")) {
            String[] arr = separationUtils.customSeparate(s);
            return makeSum(arr);
        }

        String[] arr = separationUtils.separate(s);
        return makeSum(arr);
    }

    private int makeSum(String[] arr) {
        int sum = 0;
        for (String s : arr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    private boolean stringIsNull(String s){
        if(s == null) return true;
        return false;
    }
}
