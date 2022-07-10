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

    public void validateNames(String[] names){
        for (String name : names) {
            validate(name);
        }
    }

    public String[] getNames(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] names = split(str);
        validateNames(names);
        return names;
    }

    public int getNumberOfGame(){
        System.out.println("시도할 회수는 몇회인가요?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
