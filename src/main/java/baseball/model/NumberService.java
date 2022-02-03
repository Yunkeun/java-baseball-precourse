package baseball.model;

import baseball.model.PlayerNumber;
import baseball.model.RandomNumber;

public interface NumberService {

	boolean compareNumbers(PlayerNumber playerNumber, RandomNumber randomNumber);
}
