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
		return Integer.parseInt(inputNumber);
	}

	public static List<String> inputPlayerNumber() {
		String inputNumber = Console.readLine();
		return Arrays.asList(inputNumber.split(regex));
	}
}
