package StringAddCalculator;

public class StringAddCalculator {

    private final SeparationUtils separationUtils;

    public StringAddCalculator(SeparationUtils separationUtils) {
        this.separationUtils = separationUtils;
    }

    public int calculate(String s) {
        if(stringIsNull(s) || s.isEmpty()) return 0;

        else if(s.startsWith("//")) {
            String[] str = separationUtils.customSeparate(s);
            return makeSum(str);
        }
        String[] str = separationUtils.separate(s);
        return makeSum(str);
    }

    private int makeSum(String[] strings) {
        int sum = 0;
        for (String s : strings) {
            int num = Integer.parseInt(s);
            ValidationUtils.validate(num);
            sum += num;
        }
        return sum;
    }

    private boolean stringIsNull(String s){
        if(s == null) return true;
        return false;
    }
}
