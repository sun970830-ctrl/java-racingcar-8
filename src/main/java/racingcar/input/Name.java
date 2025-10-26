package racingcar.input;

import racingcar.domain.Car;
import racingcar.domain.CarName;

import java.util.ArrayList;
import java.util.List;

public class Name {
    public static List<Car> cars(String names) {
        String[] a = names.split(",");
        List<Car> cars = new ArrayList<>();
        for (String s : a) {
            cars.add(new Car(new CarName(s)));
        }
        return cars;
    }
}