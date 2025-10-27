package racingcar.input;

public class Try {
    public static int parse(String tries) {
        try {
            return Integer.parseInt(tries);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다");
        }
    }
}