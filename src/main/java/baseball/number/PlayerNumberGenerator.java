package baseball.number;

import baseball.view.InputView;
import java.util.ArrayList;
import java.util.List;

public class PlayerNumberGenerator implements NumberGenerator {

	@Override
	public ArrayList<Integer> generateNumber() {
		ArrayList<Integer> numbers = new ArrayList<>();
		List<String> inputNumbers = InputView.inputPlayerNumber();
		for (String number : inputNumbers) {
			numbers.add(Integer.parseInt(number));
		}
		return numbers;
	}
}
