package baseball.utils;

import baseball.model.Numbers;
import baseball.view.InputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class NumberFactory {

	private static final int MINIMUM_RANGE = 1;
	private static final int MAXIMUM_RANGE = 9;
	private static final int NUMBERS_SIZE = 3;

	private NumberFactory() {
	}

	public static Numbers createPlayerNumber() {
		return InputView.inputPlayerNumber();
	}

	public static Numbers createRandomNumber() {
		// 중복 허용 X -> Set 사용하기
		final Set<Integer> numbers = new HashSet<>();
		while (numbers.size() != NUMBERS_SIZE) {
			numbers.add(pickRandomNumber());
		}
		return new Numbers(new LinkedList<>(numbers));
	}

	// pickNumber 보다 더 구체적인 네이밍 pickNumber -> pickRandomNumber
	private static int pickRandomNumber() {
		return Randoms.pickNumberInRange(MINIMUM_RANGE, MAXIMUM_RANGE);
	}
}
