package baseball.model;

public class NumberServiceImpl implements NumberService {

	private final HintService hintService;

	public NumberServiceImpl(HintService hintService) {
		this.hintService = hintService;
	}

	@Override
	public boolean compareNumbers(Numbers playerNumber, Numbers randomNumber) {
		hintService.giveHint();
		return playerNumber.getNumbers().equals(randomNumber.getNumbers());
	}
}
