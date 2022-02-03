package baseball.controller;

import baseball.model.HintService;
import baseball.model.HintServiceImpl;
import baseball.model.Numbers;
import baseball.utils.NumberFactory;
import baseball.model.NumberService;
import baseball.model.NumberServiceImpl;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private Numbers randomNumber;
	private Numbers playerNumber;

	public void controlGame() {
		randomNumber = NumberFactory.createRandomNumber();
		do {
			play();
		} while (!validateFinish());
	}

	private void play() {
		OutputView.askPlayerNumber();
		playerNumber = NumberFactory.createPlayerNumber();
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
