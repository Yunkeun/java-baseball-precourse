package baseball.view;

import camp.nextstep.edu.missionutils.Console;

/**
 * 유저에게 입력을 받는 뷰 클래스
 */
public class InputView {

	private InputView() {
	}

	public static String getInputNumber() {
		String playerNum;

		playerNum = Console.readLine();
		return playerNum;
	}

	public static String getReplayOrNot() {
		String number;

		number = Console.readLine();
		return number;
	}
}
