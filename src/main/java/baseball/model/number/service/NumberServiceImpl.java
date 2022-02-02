package baseball.model.number.service;

import baseball.model.hint.service.HintService;
import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;

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
