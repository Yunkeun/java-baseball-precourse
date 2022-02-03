package baseball.model;

import baseball.view.OutputView;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Numbers {

	public static final int SIZE = 3;
	private final List<Integer> numbers;

	public Numbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	private void validate(List<Integer> numbers) {
		if (numbers.size() != SIZE) {
			OutputView.printException();
		}
		if (numbers.size() != new HashSet(numbers).size()) {
			OutputView.printException();
		}
	}

	// equals override 하여 같은 객체라면 return true
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Numbers numbers1 = (Numbers) o;
		return Objects.equals(numbers, numbers1.numbers);
	}

	@Override
	public int hashCode() {
		return Objects.hash(numbers);
	}
}
