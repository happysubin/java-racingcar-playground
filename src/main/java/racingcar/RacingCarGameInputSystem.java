package racingcar;

public class RacingCarGameInputSystem {
    public int inputRounds(String num) {
        if(!Character.isDigit(num.charAt(0))){
            throw new IllegalStateException("숫자를 입력해주세요");
        }
        return Integer.valueOf(num);
    }
}
