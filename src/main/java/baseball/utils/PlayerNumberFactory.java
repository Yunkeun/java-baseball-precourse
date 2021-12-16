package baseball.utils;

import baseball.models.PlayerNumber;
import java.util.ArrayList;
import java.util.List;

public class PlayerNumberFactory {

	private PlayerNumberFactory() {
	}

	public static PlayerNumber createPlayerNumber(String inputNumber) {
		List<Integer> playerNumbers = new ArrayList<>();
		do {
			playerNumbers.add(Integer.parseInt(inputNumber.split("")[playerNumbers.size()]));
		}
		while (playerNumbers.size() != inputNumber.length());
		return new PlayerNumber(playerNumbers);
	}
}
