package refactoring;

public class Application {
    public static void main(String[] args) {
        InputUi inputUi = new InputUi();
        String[] names = inputUi.getNames();
        int numberOfGame = inputUi.getNumberOfGame();

        RacingGame racingGame = new RacingGame(names, numberOfGame);
        racingGame.playGame();
    }
}

/**
 * 다음번에는 랜덤을 의존 관계 제일 위에 두는 방식을 선택하자. 물론 익명 클래스를 오버라이딩해 테스트하는 방법ㄷ 좋았다.
 *
 */