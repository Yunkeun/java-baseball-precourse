package utils;

import baseball.controller.GameController;
import baseball.models.AnswerNumber;
import baseball.models.PlayerNumber;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Objects;

public class TerminateUtil {

	private static final String REPLAY_NUMBER = "1";

	private TerminateUtil() {
	}

	public static boolean correctAnswer(AnswerNumber answerNumber, PlayerNumber playerNumber) {
		return answerNumber.getAnswerNumber().equals(playerNumber.getPlayerNumber());
	}

	public static boolean decideReplay() {
		String number = InputView.getReplayOrNot();
		ExceptionUtil.validateReplay(number);
		return (Objects.equals(number, REPLAY_NUMBER));
	}

	public static void finishGame() {
		OutputView.printCorrectAnswer();
		OutputView.askReplay();
		if (decideReplay()) {
			GameController.controlGame();
		}
	}
}
