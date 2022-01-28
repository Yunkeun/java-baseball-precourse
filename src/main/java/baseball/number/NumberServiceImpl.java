package baseball.number;

import baseball.hint.HintService;

public class NumberServiceImpl implements NumberService {

	private final HintService hintService;

	public NumberServiceImpl(HintService hintService) {
		this.hintService = hintService;
	}

	@Override
	public void compareNumbers(PlayerNumber playerNumber, RandomNumber randomNumber) {
		if (playerNumber.getPlayerNumber() == randomNumber.getRandomNumber()) {
			System.out.println("playerNumber = " + playerNumber.getPlayerNumber());
			System.out.println("randomNumber = " + randomNumber.getRandomNumber());
			System.out.println("정답입니다.");
			return;
		}
		hintService.giveHint();
	}
}
