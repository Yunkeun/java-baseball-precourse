package baseball.model;

public class NumberServiceImpl implements NumberService {

	// compareNumbers는 대소비교의 뉘앙스, 더 구체적인 의미를 가지게 네이밍한다.
	// compareNumbers -> isSame
	@Override
	public boolean isSame(Numbers playerNumber, Numbers randomNumber) {
		// getter로 값을 꺼내어 로직을 수행하기 보다는 객체 내 로직을 호출한다.
		return playerNumber.equals(randomNumber);
	}
}
