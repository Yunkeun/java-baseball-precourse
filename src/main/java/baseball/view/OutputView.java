package baseball.view;

public class OutputView {

	private OutputView() {
	}

	private static final String ASK_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
	private static final String BALL = "볼 ";
	private static final String STRIKE = "스트라이크";
	private static final String NOTHING = "낫싱";
	private static final String CORRECT_ANSWER = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private static final String REPLAY_OR_NOT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
	private static final int INITIAL_VALUE = 0;

	public static void askNumber() {
		System.out.print(ASK_NUMBER_MESSAGE);
	}

	public static void printCorrectAnswer() {
		System.out.println(CORRECT_ANSWER);
	}

	public static void askReplay() {
		System.out.println(REPLAY_OR_NOT);
	}

	public static void printHint(int ballCount, int strikeCount) {
		if (ballCount == INITIAL_VALUE && strikeCount == INITIAL_VALUE) {
			OutputView.printNothing();
			OutputView.printNewLine();
			return;
		}
		if (ballCount != INITIAL_VALUE) {
			OutputView.printBall(ballCount);
		}
		if (strikeCount != INITIAL_VALUE) {
			OutputView.printStrike(strikeCount);
		}
		OutputView.printNewLine();
	}

	private static void printNewLine() {
		System.out.println();
	}

	private static void printBall(int ballCount) {
		System.out.print(ballCount + BALL);
	}

	private static void printStrike(int strikeCount) {
		System.out.print(strikeCount + STRIKE);
	}

	private static void printNothing() {
		System.out.println(NOTHING);
	}
}
