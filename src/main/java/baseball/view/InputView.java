package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

	private static final String REGEX = "";
	private static final String NUMBER_REGEX = "^[1-9]+$";
	private static final int RESTART = 1;
	private static final int END = 2;

	private InputView() {
	}

	public static int inputRetry() {
		String inputNumber = Console.readLine();
		int number = Integer.parseInt(inputNumber);
		if (!(number == RESTART || number == END)) {
			OutputView.printException();
		}
		return number;
	}

	public static List<String> inputPlayerNumber() {
		String inputNumber = Console.readLine();
		if (!inputNumber.matches(NUMBER_REGEX) || inputNumber.isEmpty()) {
			OutputView.printException();
		}
		List<String> playerNumber = Arrays.asList(inputNumber.split(REGEX));
		if (playerNumber.get(0).equals(playerNumber.get(1))
			|| playerNumber.get(1).equals(playerNumber.get(2))
			|| playerNumber.get(0).equals(playerNumber.get(2))) {
			OutputView.printException();
		}
		return playerNumber;
	}
}
