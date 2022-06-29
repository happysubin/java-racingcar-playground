package StringAddCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeparationUtils  {

    public String[] separate(String s) {
        return s.split("[,:]");
    }

    public String[] customSeparate(String s) {

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);

        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            return tokens;
        }
        throw new RuntimeException("정확한 패턴을 입력해주세요");
    }
}
