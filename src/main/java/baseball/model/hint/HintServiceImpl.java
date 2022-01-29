package baseball.model.hint;

import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;
import baseball.view.OutputView;

public class HintServiceImpl implements HintService {

	private final PlayerNumber playerNumber;
	private final RandomNumber randomNumber;

	public HintServiceImpl(PlayerNumber playerNumber, RandomNumber randomNumber) {
		this.playerNumber = playerNumber;
		this.randomNumber = randomNumber;
	}

	@Override
	public void giveHint() {
		OutputView.printHint(countBall(), countStrike());
	}

	private int countBall() {
		int count = 0;
		for (int number : playerNumber.getPlayerNumber()) {
			if (randomNumber.getRandomNumber().contains(number)) {
				count++;
			}
		}
		return count - countStrike();
	}

	private int countStrike() {
		int count = 0;
		int index = 0;
		for (int number : playerNumber.getPlayerNumber()) {
			if (randomNumber.getRandomNumber().get(index) == number) {
				count++;
			}
			index++;
		}
		return count;
	}
}
