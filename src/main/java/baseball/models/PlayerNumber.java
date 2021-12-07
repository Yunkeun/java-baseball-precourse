package baseball.models;

import utils.ExceptionUtil;
import java.util.ArrayList;
import java.util.List;

public class PlayerNumber {

	private List<Integer> playerNumber;

	public PlayerNumber(String inputNumber) {
		playerNumber = new ArrayList<>();
		ExceptionUtil.validatePlayerNumber(inputNumber);
		this.playerNumber = getPlayerNumber(inputNumber);
	}

	public List<Integer> getPlayerNumber() {
		return playerNumber;
	}

	public int getOneNumber(int index) {
		return playerNumber.get(index);
	}

	private List<Integer> getPlayerNumber(String inputNumber) {
		while (playerNumber.size() != inputNumber.length()) {
			playerNumber.add(Integer.parseInt(inputNumber.split("")[playerNumber.size()]));
		}
		return playerNumber;
	}
}
