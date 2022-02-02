package baseball.model.number.service;

import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;

public interface NumberService {

	boolean compareNumbers(PlayerNumber playerNumber, RandomNumber randomNumber);
}
