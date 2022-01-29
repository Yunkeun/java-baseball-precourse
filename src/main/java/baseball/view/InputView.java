package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

	private static final String regex = "";

	private InputView() {
	}

	public static int inputRetry() {
		String inputNumber = Console.readLine();
		int number = Integer.parseInt(inputNumber);
		if (!(number == 1 || number == 2)) {
			OutputView.printException();
		}
		return number;
	}

	public static List<String> inputPlayerNumber() {
		String inputNumber = Console.readLine();
		List<String> playerNumber = Arrays.asList(inputNumber.split(regex));
		if (playerNumber.get(0).equals(playerNumber.get(1))
			|| playerNumber.get(1).equals(playerNumber.get(2))
			|| playerNumber.get(0).equals(playerNumber.get(2))) {
			OutputView.printException();
		}
		return playerNumber;
	}
}
