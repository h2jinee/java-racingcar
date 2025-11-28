package racinggame.domain;

public class CarPosition {

    private static final int MIN_POSITION = 0;
    private final int position;

    public CarPosition(int position) {
        validatePosition(position);
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public CarPosition move(RandomNumber randomValue) {
        if (randomValue.isMovable()) {
            return new CarPosition(this.position + 1);
        }
        return this;
    }

    public int compareAndReturnMax(int currentMax) {
        return Math.max(currentMax, this.position);
    }

    public boolean isGreaterThanOrEqual(int targetPosition) {
        return this.position >= targetPosition;
    }

    private void validatePosition(int position) {
        if (position < MIN_POSITION) {
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition that = (CarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(position);
    }

    @Override
    public String toString() {
        return String.valueOf(position);
    }
}
