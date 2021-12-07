package baseball.controller;

import utils.HintGenerator;
import utils.TerminateUtil;
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
			HintGenerator.giveHint(answerNumber, playerNumber);
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
