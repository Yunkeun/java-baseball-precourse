package baseball.model;

import java.util.List;
import java.util.Objects;

public class Numbers {

	private final List<Integer> numbers;

	public Numbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	public List<Integer> getNumbers() {
		return numbers;
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

	@Override
	public String toString() {
		return "Numbers{" +
			"numbers=" + numbers +
			'}';
	}
}
