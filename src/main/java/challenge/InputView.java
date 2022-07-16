package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private  Scanner scanner = new Scanner(System.in);

    private static final String NAME_VALIDATION_FAIL_MESSAGE = "자동차 이름은 5글자 미만입니다.";
    private static final String NUMBER_VALIDATION_FAIL_MESSAGE = "자동차 이름은 5글자 미만입니다.";
    private static final String REGEX_VALIDATION = "[0-9]";
    private static final String SPLIT_STANDARD = ",";
    private static final String INPUT_NAME_GUIDE_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_NUMBER_GUIDE_MESSAGE = "시도할 회수는 몇회인가요?";

    public  List<String> getNames() {
        System.out.println(INPUT_NAME_GUIDE_MESSAGE);
        String nameString = getString();
        List<String> names = split(nameString);
        validate(names);
        return names;
    }

    public  String getString() {
        return scanner.next();
    }

    public  void validate(List<String> names) {
        for (String name : names) {
            if(name.length() > 5){
                throw new IllegalStateException(NAME_VALIDATION_FAIL_MESSAGE);
            }
        }
    }

    public  List<String> split(String nameString){
        List<String> names = new ArrayList<>();
        String[] split = nameString.split(SPLIT_STANDARD);
        for (String s : split) {
            names.add(s);
        }
        return names;
    }

    public int getNumberOfGame() {
        System.out.println(INPUT_NUMBER_GUIDE_MESSAGE);
        String number = getString();
        Pattern pattern = Pattern.compile(REGEX_VALIDATION);
        Matcher matcher = pattern.matcher(number);
        if(!matcher.matches()){
            throw new IllegalStateException(NUMBER_VALIDATION_FAIL_MESSAGE);
        }
        return Integer.valueOf(number);
    }
}
