package baseball.models;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerNumber {

	private final List<Integer> answerNumber;
	private static final int RANDOM_NUMBER_SIZE = 3;
	private static final int START_RANDOM_VALUE = 1;
	private static final int END_RANDOM_VALUE = 9;

	public AnswerNumber() {
		this.answerNumber = generateRandomNumber();
	}

	public List<Integer> getAnswerNumber() {
		return answerNumber;
	}

	public int getOneNumber(int index) {
		return answerNumber.get(index);
	}

	public boolean checkContainNumber(int number) {
		return answerNumber.contains(number);
	}

	private List<Integer> generateRandomNumber() {
		List<Integer> randomNumbers = new ArrayList<>();
		do {
			int randomNumber = Randoms.pickNumberInRange(START_RANDOM_VALUE, END_RANDOM_VALUE);
			if (!randomNumbers.contains(randomNumber)) {
				randomNumbers.add(randomNumber);
			}
		}
		while (randomNumbers.size() < RANDOM_NUMBER_SIZE);
		return randomNumbers;
	}
}
