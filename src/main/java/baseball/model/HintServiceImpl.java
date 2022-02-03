package baseball.model;

import baseball.view.OutputView;
import baseball.view.printstrategy.PrintStrategy;
import baseball.view.printstrategy.PrintStrategyKor;

public class HintServiceImpl implements HintService {

	@Override
	public void giveHint(Numbers playerNumber, Numbers randomNumber) {
		PrintStrategy printStrategy = new PrintStrategyKor();
		OutputView.printHint(countBall(playerNumber, randomNumber), countStrike(playerNumber, randomNumber), printStrategy);
	}

	private int countBall(Numbers playerNumber, Numbers randomNumber) {
		int count = 0;
		for (int number : playerNumber.getNumbers()) {
			if (randomNumber.getNumbers().contains(number)) {
				count++;
			}
		}
		return count - countStrike(playerNumber, randomNumber);
	}

	private int countStrike(Numbers playerNumber, Numbers randomNumber) {
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
