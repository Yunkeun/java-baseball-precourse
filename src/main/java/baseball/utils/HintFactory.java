package baseball.utils;

import baseball.models.AnswerNumber;
import baseball.models.Hint;
import baseball.models.PlayerNumber;
import baseball.view.OutputView;

public class HintFactory {

	private HintFactory() {
	}

	private static final int INITIAL_VALUE = 0;

	public static void makeHint(AnswerNumber answerNumber, PlayerNumber playerNumber) {
		Hint hint = new Hint(INITIAL_VALUE, INITIAL_VALUE);
		hint.countStrike(answerNumber, playerNumber);
		hint.countBall(answerNumber, playerNumber);
		OutputView.printHint(hint.getBallCount(), hint.getStrikeCount());
	}
}
