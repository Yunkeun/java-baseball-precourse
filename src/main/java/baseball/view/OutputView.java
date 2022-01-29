package baseball.view;

import baseball.model.hint.HintType;

public class OutputView {

	private static final String ASK_RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	private OutputView() {
	}

	public static void printRetry() {
		System.out.println(ASK_RETRY);
	}

	public static void printHint(int countBall, int countStrike) {
		if (countBall == 0 & countStrike == 0) {
			System.out.println(HintType.낫싱);
			return;
		}
		if (countBall == 0) {
			System.out.println(Integer.toString(countStrike) + HintType.스트라이크);
			return;
		}
		if (countStrike == 0) {
			System.out.println(Integer.toString(countBall) + HintType.볼);
			return;
		}
		System.out.println(
			Integer.toString(countBall) + HintType.볼 + " " + countStrike + HintType.스트라이크);
	}
}
