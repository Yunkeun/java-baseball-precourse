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

	public void controlGame() {
		do {
			playGame(NumberFactory.createRandomNumber());
		} while (askRetry());
	}

	private void playGame(Numbers answerNumber) {
		while (true) {
			OutputView.askPlayerNumber();
			final Numbers playerNumber = NumberFactory.createPlayerNumber();
			HintService hintService = new HintServiceImpl(playerNumber, answerNumber);
			NumberService numberService = new NumberServiceImpl(hintService);
			if (numberService.isSame(playerNumber, answerNumber)) {
				break;
			}
		}
	}

	// 재귀보다는 반복 (스택 오버플로우 방지)
	private boolean askRetry() {
		OutputView.printFinish();
		OutputView.printRetry();
		return InputView.inputRetry() == InputView.RESTART;
	}
}
