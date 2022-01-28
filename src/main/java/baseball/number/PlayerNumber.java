package baseball.number;

import baseball.view.InputView;
import java.util.ArrayList;
import java.util.List;

public class PlayerNumber implements Number {

	public static ArrayList<Integer> numbers = new ArrayList<>();

	@Override
	public ArrayList<Integer> generateNumber() {
		List<String> inputNumbers = InputView.inputPlayerNumber();
		for (String number : inputNumbers) {
			numbers.add(Integer.parseInt(number));
		}
		return numbers;
	}
}
