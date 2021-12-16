package baseball.view;

import baseball.utils.ExceptionUtil;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

	private InputView() {
	}

	public static String getInputNumber() {
		OutputView.askNumber();
		String playerNumber = Console.readLine();
		ExceptionUtil.validatePlayerNumber(playerNumber);
		return playerNumber;
	}

	public static String getReplayOrNot() {
		String number = Console.readLine();
		ExceptionUtil.validateReplay(number);
		return number;
	}
}
