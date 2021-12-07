package baseball.models;

import java.util.Objects;

public class Hint {

	private int ballCount;
	private int strikeCount;
	private int containedCount;
	private static int LOOP_INDEX = 0;
	private static final int INITIAL_VALUE = 0;
	private static final int MAX_INDEX_VALUE = 3;

	public Hint(int ballCount, int strikeCount) {
		this.ballCount = ballCount;
		this.strikeCount = strikeCount;
		this.containedCount = 0;
	}

	public int getBallCount() {
		return ballCount;
	}

	public int getStrikeCount() {
		return strikeCount;
	}

	public void countStrike(AnswerNumber answerNumber, PlayerNumber playerNumber) {
		LOOP_INDEX = INITIAL_VALUE;

		while (LOOP_INDEX != MAX_INDEX_VALUE) {
			if (Objects.equals(answerNumber.getOneNumber(LOOP_INDEX),
				playerNumber.getOneNumber(LOOP_INDEX))) {
				strikeCount++;
			}
			LOOP_INDEX++;
		}
	}

	public void countBall(AnswerNumber answerNumber, PlayerNumber playerNumber) {
		countNumberOfContain(answerNumber, playerNumber);
		ballCount = containedCount - strikeCount;
	}

	private void countNumberOfContain(AnswerNumber answerNumber, PlayerNumber playerNumber) {
		LOOP_INDEX = INITIAL_VALUE;

		while (LOOP_INDEX != MAX_INDEX_VALUE) {
			if (answerNumber.checkContainNumber(playerNumber.getOneNumber(LOOP_INDEX))) {
				containedCount++;
			}
			LOOP_INDEX++;
		}
	}
}
