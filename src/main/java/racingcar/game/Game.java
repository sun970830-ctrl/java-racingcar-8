package racingcar.game;

import racingcar.domain.Car;
import java.util.List;

public class Game {
    List<Car> cars;

    public Game(List<Car> cars) {
        this.cars = cars;
    }

    public void playOne() {
        for (Car c : cars) {
            c.moveIf(Rule.RandomGo());
        }
    }

    public List<Car> cars() {
        return cars;
    }
}