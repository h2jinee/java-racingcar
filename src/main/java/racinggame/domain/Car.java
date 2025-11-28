package racinggame.domain;

import static racinggame.view.OutputView.*;

import java.util.Objects;

public class Car {

    public static final int MIN_MOVE_NUMBER = 0;
    public static final int MAX_MOVE_NUMBER = 9;

    private CarPosition position;
    private final CarName name;

    public Car(CarName name, int position) {
        this(name, new CarPosition(position));
    }

    public Car(String name, CarPosition position) {
        this(new CarName(name), position);
    }

    public Car(CarName name, CarPosition position) {
        this.name = name;
        this.position = position;
    }

    public String move(RandomNumber randomNumber) {
        this.position = this.position.move(randomNumber);
        return getPositionDisplay(this);
    }

    public boolean isWinnerWith(int targetPosition) {
        return position.isGreaterThanOrEqual(targetPosition);
    }

    public int compareAndReturnMax(int currentMax) {
        return position.compareAndReturnMax(currentMax);
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name);
    }

    @Override
    public String toString() {
        return "Car{" + "position=" + position.getPosition() + ", name='" + name.getName() + '\'' + '}';
    }
}
