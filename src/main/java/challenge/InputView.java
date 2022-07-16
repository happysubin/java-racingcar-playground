package challenge;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputView {

    private  Scanner scanner = new Scanner(System.in);

    public  List<String> getNames() {
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
                throw new IllegalStateException("자동차 이름은 5글자 미만입니다");
            }
        }
    }

    public  List<String> split(String nameString){
        List<String> names = new ArrayList<>();
        String[] split = nameString.split(",");
        for (String s : split) {
            names.add(s);
        }
        return names;
    }


}
