package baseball.number;

public class NumberServiceImpl implements NumberService {

	private final Number playerNumber;
	private final Number randomNumber;

	public NumberServiceImpl(Number playerNumber, Number randomNumber) {
		this.playerNumber = playerNumber;
		this.randomNumber = randomNumber;
	}

	@Override
	public void compareNumbers() {
		if (playerNumber == randomNumber) {
			//askRetry();
			return;
		}
		//getHint();
	}
}
