package baseball.model;

import baseball.view.OutputView;

public class HintServiceImpl implements HintService {

	private final Numbers playerNumber;
	private final Numbers randomNumber;

	public HintServiceImpl(Numbers playerNumber, Numbers randomNumber) {
		this.playerNumber = playerNumber;
		this.randomNumber = randomNumber;
	}

	@Override
	public void giveHint() {
		OutputView.printHint(countBall(), countStrike());
	}

	// 구현 클래스에서 기능적인 메소드가 있어도 될까?
	private int countBall() {
		int count = 0;
		for (int number : playerNumber.getNumbers()) {
			if (randomNumber.getNumbers().contains(number)) {
				count++;
			}
		}
		return count - countStrike();
	}

	private int countStrike() {
		int count = 0;
		int index = 0;
		for (int number : playerNumber.getNumbers()) {
			if (randomNumber.getNumbers().get(index) == number) {
				count++;
			}
			index++;
		}
		return count;
	}
}
