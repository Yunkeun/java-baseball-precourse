package baseball.model.number;

import baseball.model.hint.HintService;

public class NumberServiceImpl implements NumberService {

	private final HintService hintService;

	public NumberServiceImpl(HintService hintService) {
		this.hintService = hintService;
	}

	@Override
	public boolean compareNumbers(PlayerNumber playerNumber, RandomNumber randomNumber) {
		if (playerNumber.getPlayerNumber().equals(randomNumber.getRandomNumber())) {
			System.out.println("정답입니다.");
			return true;
		}
		hintService.giveHint();
		return false;
	}
}
