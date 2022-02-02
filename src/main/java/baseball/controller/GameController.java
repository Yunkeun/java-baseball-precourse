package baseball.controller;

import baseball.model.hint.service.HintService;
import baseball.model.hint.service.HintServiceImpl;
import baseball.model.number.utils.Factory;
import baseball.model.number.service.NumberService;
import baseball.model.number.service.NumberServiceImpl;
import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private RandomNumber randomNumber;
	private PlayerNumber playerNumber;

	public void controlGame() {
		randomNumber = Factory.createRandomNumber();
		do {
			play();
		} while (!validateFinish());
	}

	private void play() {
		OutputView.askPlayerNumber();
		playerNumber = Factory.createPlayerNumber();
	}

	private boolean validateFinish() {
		// 서비스 생성하는 위치가 애매하다
		// 서비스가 playerNumber, randomNumber 에 영향을 받아야 정상인거 같은데
		HintService hintService = new HintServiceImpl(playerNumber, randomNumber);
		NumberService numberService = new NumberServiceImpl(hintService);
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
