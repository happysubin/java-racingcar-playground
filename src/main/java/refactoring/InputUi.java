package refactoring;


import java.util.Scanner;

public class InputUi {
    public boolean validate(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalStateException("자동차 이름을 넣어주세요.");
        }
        if(name.length() > 5){
            throw new IllegalStateException("자동차 이름은 5자를 초과할 수 없습니다.");
        }
        return true;
    }

    public String[] split(String s) {
        return s.split(",");
    }
}
