package baseball.controller;

import baseball.utils.HintFactory;
import baseball.utils.TerminateUtil;
import baseball.models.AnswerNumber;
import baseball.models.PlayerNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

public class GameController {

	private GameController() {
	}

	public static void controlGame() {
		AnswerNumber answerNumber = new AnswerNumber();
		System.out.println(answerNumber.getAnswerNumber());
		while (true) {
			PlayerNumber playerNumber = getPlayerNumber();
			HintFactory.giveHint(answerNumber, playerNumber);
			if (TerminateUtil.correctAnswer(answerNumber, playerNumber)) {
				TerminateUtil.finishGame();
				break;
			}
		}
	}

	private static PlayerNumber getPlayerNumber() {
		OutputView.askNumber();
		String inputNumber = InputView.getInputNumber();
		return new PlayerNumber(inputNumber);
	}
}
