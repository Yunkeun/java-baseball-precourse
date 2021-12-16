package baseball.models;

import java.util.List;

public class PlayerNumber {

	private final List<Integer> playerNumber;

	public PlayerNumber(List<Integer> inputNumber) {
		this.playerNumber = inputNumber;
	}

	public List<Integer> getPlayerNumber() {
		return playerNumber;
	}

	public int getOneNumber(int index) {
		return playerNumber.get(index);
	}
}
