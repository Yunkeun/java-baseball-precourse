package baseball.utils;

import baseball.models.AnswerNumber;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerNumberFactory {

	private static final int RANDOM_NUMBER_SIZE = 3;
	private static final int START_RANDOM_VALUE = 1;
	private static final int END_RANDOM_VALUE = 9;

	private AnswerNumberFactory() {
	}

	public static AnswerNumber createRandomNumber() {
		List<Integer> randomNumbers = new ArrayList<>();
		do {
			int randomNumber = Randoms.pickNumberInRange(START_RANDOM_VALUE, END_RANDOM_VALUE);
			if (!randomNumbers.contains(randomNumber)) {
				randomNumbers.add(randomNumber);
			}
		}
		while (randomNumbers.size() < RANDOM_NUMBER_SIZE);
		return new AnswerNumber(randomNumbers);
	}
}
