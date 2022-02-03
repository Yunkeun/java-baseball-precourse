package baseball.view;

import baseball.model.Numbers;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

	private static final String SPACE = "";
	private static final String NUMBER_REGEX = "^[1-9]+$";
	public static final int RESTART = 1;
	public static final int END = 2;

	private InputView() {
	}

	public static boolean inputRetry() {
		final String inputNumber = Console.readLine();
		final int number = Integer.parseInt(inputNumber);
		if (!(number == RESTART || number == END)) {
			OutputView.printException();
		}
		return number == RESTART;
	}

	// stream 사용하여 side-effect 방지하기
	public static Numbers inputPlayerNumber() {
		final String inputNumber = Console.readLine();
		if (!inputNumber.matches(NUMBER_REGEX) || inputNumber.isEmpty()) {
			OutputView.printException();
		}
		List<Integer> playerNumber = Arrays.stream(inputNumber.split(SPACE))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
		return new Numbers(playerNumber);
	}
}
