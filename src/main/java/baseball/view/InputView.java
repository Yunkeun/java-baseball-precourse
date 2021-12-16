package baseball.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 유저에게 입력을 받는 뷰 클래스
 */
public class InputView {

	private InputView() {
	}

	public static String getInputNumber() {
		return Console.readLine();
	}

	public static String getReplayOrNot() {
		return Console.readLine();
	}
}
