package baseball.model;

public class NumberServiceImpl implements NumberService {

	private final HintService hintService;

	public NumberServiceImpl(HintService hintService) {
		this.hintService = hintService;
	}

	@Override
	public boolean compareNumbers(PlayerNumber playerNumber, RandomNumber randomNumber) {
		hintService.giveHint();
		return playerNumber.getPlayerNumber().equals(randomNumber.getRandomNumber());
	}
}
