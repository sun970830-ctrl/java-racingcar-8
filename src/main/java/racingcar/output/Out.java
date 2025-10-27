package racingcar.output;

import racingcar.domain.Car;
import java.util.List;
import java.util.stream.Collectors;

public class Out {
    public static void round(List<Car> cars) {
        for (Car c : cars) {
            System.out.println(c.name().value() + " : " + "-".repeat(c.distance()));
        }
        System.out.println();
    }

    public static void winners(List<Car> cars) {
        int max = cars.stream().mapToInt(Car::distance).max().orElse(0);
        List<String> list = cars.stream()
                .filter(c -> c.distance() == max)
                .map(c -> c.name().value())
                .collect(Collectors.toList());
        System.out.println("최종 우승자 : " + String.join(", ", list));
    }
}