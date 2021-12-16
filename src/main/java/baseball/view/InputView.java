package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	private InputView() {
	}

	public static String getInputNumber() {
		OutputView.askNumber();
		return Console.readLine();
	}

	public static String getReplayOrNot() {
		return Console.readLine();
	}
}
