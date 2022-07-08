package racingcar;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String names = sc.next();
        System.out.println("시도할 회수는 몇회인가요?");
        String round = sc.next();

        RacingCarGame racingCarGame = new RacingCarGame(round, names);
        Cars cars = racingCarGame.playGame();

        ChooseWinnerSystem winnerSystem = new ChooseWinnerSystem(cars);
        String winners = winnerSystem.chooseWinner();
        System.out.println(winners + " 가 최종우승했습니다.");

    }
}
