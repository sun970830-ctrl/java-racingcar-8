package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.input.Name;
import racingcar.input.Try;
import racingcar.game.Game;
import racingcar.output.Out;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String names = Console.readLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tries = Console.readLine();

        List<Car> cars = Name.cars(names);
        int n = Try.parse(tries);

        System.out.println();
        System.out.println("실행 결과");

        Game game = new Game(cars);
        for (int i = 0; i < n; i++) {
            game.play();
            Out.round(game.cars());
        }
        Out.winners(game.cars());
    }
}
