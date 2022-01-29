package baseball.model.number;

import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Generator {

	private static ArrayList<Integer> numbers;
	private static final int MINIMUM_RANGE = 1;
	private static final int MAXIMUM_RANGE = 9;
	private static final int NUMBERS_SIZE = 3;

	private Generator() {
	}

	public static PlayerNumber generatePlayerNumber() {
		numbers = new ArrayList<>();
		List<String> inputNumbers = InputView.inputPlayerNumber();
		for (String number : inputNumbers) {
			numbers.add(Integer.parseInt(number));
		}
		return new PlayerNumber(numbers);
	}

	public static RandomNumber generateRandomNumber() {
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
