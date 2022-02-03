package baseball.utils;

import baseball.model.PlayerNumber;
import baseball.model.RandomNumber;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class NumberFactory {

	private static ArrayList<Integer> numbers;
	private static final int MINIMUM_RANGE = 1;
	private static final int MAXIMUM_RANGE = 9;
	private static final int NUMBERS_SIZE = 3;

	private NumberFactory() {
	}

	public static PlayerNumber createPlayerNumber() {
		numbers = new ArrayList<>();
		List<String> inputNumbers = InputView.inputPlayerNumber();
		if (inputNumbers.size() != NUMBERS_SIZE) {
			OutputView.printException();
		}
		for (String number : inputNumbers) {
			numbers.add(Integer.parseInt(number));
		}
		return new PlayerNumber(numbers);
	}

	public static RandomNumber createRandomNumber() {
		numbers = new ArrayList<>();
		while (numbers.size() != NUMBERS_SIZE) {
			int pickedNumber = pickNumber();
			if (!numbers.contains(pickedNumber)) {
				numbers.add(pickedNumber);
			}
		}
		return new RandomNumber(numbers);
	}

	private static int pickNumber() {
		return Randoms.pickNumberInRange(MINIMUM_RANGE, MAXIMUM_RANGE);
	}
}
