package baseball.models;

import java.util.List;

public class AnswerNumber {

	private final List<Integer> answerNumber;

	public AnswerNumber(List<Integer> answerNumber) {
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
}
