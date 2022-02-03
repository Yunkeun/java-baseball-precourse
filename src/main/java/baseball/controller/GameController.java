package baseball.controller;

import baseball.model.HintService;
import baseball.model.Numbers;
import baseball.utils.NumberFactory;
import baseball.model.NumberService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private final HintService hintService;
	private final NumberService numberService;

	// HintService, NumberService 인스턴스를 Application에서 만들어 컨트롤러에 주입한다.
	public GameController(HintService hintService, NumberService numberService) {
		this.hintService = hintService;
		this.numberService = numberService;
	}

	public void controlGame() {
		do {
			playGame(NumberFactory.createRandomNumber());
		} while (askRetry());
	}

	private void playGame(Numbers answerNumber) {
		System.out.println(answerNumber.toString());
		while (true) {
			OutputView.askPlayerNumber();
			final Numbers playerNumber = NumberFactory.createPlayerNumber();
			hintService.giveHint(playerNumber, answerNumber);
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
