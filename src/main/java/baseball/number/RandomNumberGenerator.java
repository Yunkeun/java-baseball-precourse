package baseball.number;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;

public class RandomNumberGenerator implements NumberGenerator {

	private static final int MINIMUM_RANGE = 1;
	private static final int MAXIMUM_RANGE = 9;
	private static final int NUMBERS_SIZE = 3;

	@Override
	public ArrayList<Integer> generateNumber() {
		ArrayList<Integer> numbers = new ArrayList<>();
		while (numbers.size() != NUMBERS_SIZE) {
			int pickedNumber = pickNumber();
			if (!numbers.contains(pickedNumber)) {
				numbers.add(pickedNumber);
			}
		}
		return numbers;
	}

	private int pickNumber() {
		return Randoms.pickNumberInRange(MINIMUM_RANGE, MAXIMUM_RANGE);
	}
}
