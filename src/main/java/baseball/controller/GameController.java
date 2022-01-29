package baseball.controller;

import baseball.model.hint.HintService;
import baseball.model.hint.HintServiceImpl;
import baseball.model.number.Generator;
import baseball.model.number.NumberService;
import baseball.model.number.NumberServiceImpl;
import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	public void controlGame() {
		RandomNumber randomNumber = Generator.generateRandomNumber();
		while (true) {
			PlayerNumber playerNumber = Generator.generatePlayerNumber();
			HintService hintService = new HintServiceImpl(playerNumber, randomNumber);
			NumberService numberService = new NumberServiceImpl(hintService);
			if (numberService.compareNumbers(playerNumber, randomNumber)) {
				askRetry();
				return;
			}
		}
	}

	private void askRetry() {
		OutputView.printRetry();
		if (InputView.inputRetry() == 1) {
			controlGame();
		}
	}
}
