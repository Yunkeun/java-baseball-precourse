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

	private RandomNumber randomNumber;
	private PlayerNumber playerNumber;

	public void controlGame() {
		randomNumber = Generator.generateRandomNumber();
		while (true) {
			play();
			HintService hintService = new HintServiceImpl(playerNumber, randomNumber);
			NumberService numberService = new NumberServiceImpl(hintService);
			if (validateFinish(numberService)) {
				return;
			}
		}
	}

	private void play() {
		OutputView.askPlayerNumber();
		playerNumber = Generator.generatePlayerNumber();
	}

	private boolean validateFinish(NumberService numberService) {
		if (numberService.compareNumbers(playerNumber, randomNumber)) {
			askRetry();
			return true;
		}
		return false;
	}

	private void askRetry() {
		OutputView.printFinish();
		OutputView.printRetry();
		if (InputView.inputRetry() == InputView.RESTART) {
			controlGame();
		}
	}
}
