package racingcar;

public class CarNameInputUi {
    public String[] inputName(String names) {
        if(names == null || names.isEmpty()){
            throw new IllegalStateException("자동차 이름을 넣어주세요");
        }
        return names.split(",");
    }
}


