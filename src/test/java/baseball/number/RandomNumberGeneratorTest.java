package baseball.number;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

	RandomNumber randomNumberGenerator = new RandomNumber();

	@Test
	@DisplayName("랜덤넘버테스트")
	void randomNumberTest() {
		// given
		ArrayList<Integer> numbers = randomNumberGenerator.generateNumber();
		// when
		// then
		System.out.println("numbers = " + numbers);
	}
}
