package racingcar;

public class CarNameInputUi {


    public String[] inputName(String names) {
        if(names == null || names.isEmpty()){
            throw new IllegalStateException("자동차 이름을 넣어주세요");
        }

        String[] result = names.split(",");

        if(CarNameValidation.NameLengthIsMoreThan5(result)){
            throw new IllegalStateException("자동차 이름은 5글자 이하입니다.");
        }

        return result;
    }
}


