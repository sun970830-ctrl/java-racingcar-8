package racingcar.domain;

public class CarName {
    public static final int maxNameLength = 5;

    private String value;

    public CarName(String name) {
        if (name.length() > maxNameLength) {
            throw new IllegalArgumentException("차 이름을" +  maxNameLength + "넘길수없습니다" );
        }
        this.value = name;
    }
    public String value() {
        return value;
    }

}

