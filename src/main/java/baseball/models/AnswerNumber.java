package baseball.models;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class AnswerNumber {

	private List<Integer> answerNumber;
	private static final int MINIMUM_INDEX = 0;
	private static final int MAXIMUM_INDEX = 9;
	private static final int INITIAL_VALUE = 0;
	private static final int FLAG_SIZE = 10;
	private static final int RANDOM_NUMBER_SIZE = 3;
	private static final int START_RANDOM_VALUE = 1;
	private static final int END_RANDOM_VALUE = 9;
	private static final int USED_VALUE_CHECK = 1;

	public AnswerNumber() {
		answerNumber = new ArrayList<>();
		List<Integer> answerNumber;
		answerNumber = generateRandomNumber();
		this.answerNumber = answerNumber;
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

	private int[] initNumberFlag() {
		int[] duplicateNumberFlag = new int[FLAG_SIZE];

		for (int i = MINIMUM_INDEX; i <= MAXIMUM_INDEX; i++) {
			duplicateNumberFlag[i] = INITIAL_VALUE;
		}
		return duplicateNumberFlag;
	}

	private List<Integer> generateRandomNumber() {
		int[] duplicateNumberFlag = initNumberFlag();
		int randomNumber;

		while (answerNumber.size() < RANDOM_NUMBER_SIZE) {
			randomNumber = Randoms.pickNumberInRange(START_RANDOM_VALUE, END_RANDOM_VALUE);
			checkDuplicateNumber(duplicateNumberFlag, randomNumber);
		}
		return answerNumber;
	}

	private void checkDuplicateNumber(int[] duplicateNumberFlag, int randomNumber) {
		int index = randomNumber - 1;
		if (duplicateNumberFlag[index] == INITIAL_VALUE) {
			duplicateNumberFlag[index] = USED_VALUE_CHECK;
			answerNumber.add(randomNumber);
		}
	}
}
