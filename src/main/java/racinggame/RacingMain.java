package racinggame;

import racinggame.domain.RacingGame;

import static racinggame.domain.CarFactory.createCars;
import static racinggame.view.InputView.*;
import static racinggame.view.OutputView.*;

public class RacingMain {

    public static void main(String[] args) {
        String carNames = getCarNames();
        int tryCount = getTryCount();

        RacingGame racingGame = new RacingGame(createCars(carNames), tryCount);
        racingGame.play();
        printWinners(racingGame);
    }
}
