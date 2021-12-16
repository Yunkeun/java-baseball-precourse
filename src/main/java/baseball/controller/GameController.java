package baseball.controller;

import baseball.utils.AnswerNumberFactory;
import baseball.utils.HintFactory;
import baseball.utils.PlayerNumberFactory;
import baseball.utils.TerminateUtil;
import baseball.models.AnswerNumber;
import baseball.models.PlayerNumber;
import baseball.view.InputView;

public class GameController {

	private GameController() {
	}

	public static void controlGame() {
		AnswerNumber answerNumber = AnswerNumberFactory.createRandomNumber();
		while (true) {
			PlayerNumber playerNumber = PlayerNumberFactory.createPlayerNumber(InputView.getInputNumber());
			HintFactory.makeHint(answerNumber, playerNumber);
			if (TerminateUtil.correctAnswer(answerNumber, playerNumber)) {
				TerminateUtil.finishGame();
				break;
			}
		}
	}
}
