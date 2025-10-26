package racingcar.domain;

public class Car {
    CarName name;
    int distance = 0;

    public CarName name() {
        return name;
    }

    public Car(CarName name) {
        this.name = name;
    }

    public int distance() {
        return distance;

    }
    public void moveIf(boolean moveable) {
        if (moveable) {
            distance++;
        }
    }
}
