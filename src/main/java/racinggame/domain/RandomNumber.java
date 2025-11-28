package racinggame.domain;

import static racinggame.domain.Car.MAX_MOVE_NUMBER;
import static racinggame.domain.Car.MIN_MOVE_NUMBER;

public class RandomNumber {
    private static final int MOVE_THRESHOLD = 4;
    private final int number;

    public RandomNumber(int number) {
        validateNumber(number);
        this.number = number;
    }

    public boolean isMovable() {
        return number >= MOVE_THRESHOLD;
    }

    private void validateNumber(int number) {
        if (number < MIN_MOVE_NUMBER || number > MAX_MOVE_NUMBER) {
            throw new IllegalArgumentException("0부터 9까지의 숫자만 입력할 수 있습니다.");
        }
    }
}
