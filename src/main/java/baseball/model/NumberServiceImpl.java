package baseball.model;

public class NumberServiceImpl implements NumberService {

	private final HintService hintService;

	public NumberServiceImpl(HintService hintService) {
		this.hintService = hintService;
	}

	// compareNumbers는 대소비교의 뉘앙스, 더 구체적인 의미를 가지게 네이밍한다.
	// compareNumbers -> isSame
	@Override
	public boolean isSame(Numbers playerNumber, Numbers randomNumber) {
		hintService.giveHint();
		return playerNumber.getNumbers().equals(randomNumber.getNumbers());
	}
}
