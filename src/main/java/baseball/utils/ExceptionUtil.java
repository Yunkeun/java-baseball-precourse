package baseball.utils;

import java.util.Arrays;
import java.util.Objects;

public class ExceptionUtil {

	private ExceptionUtil() {
	}

	private static final int MINIMUM_INDEX = 0;
	private static final int MAXIMUM_INDEX = 2;
	private static final int VALID_NUMBER_LENGTH = 3;
	private static final int VALID_MINIMUM_RANGE = 49;
	private static final int VALID_MAXIMUM_RANGE = 57;
	private static final String INVALID_LENGTH_MESSAGE = "잘못된 숫자의 길이가 입력되었습니다.";
	private static final String INVALID_RANGE_MESSAGE = "잘못된 범위의 문자가 입력되었습니다.";
	private static final String INVALID_DUPLICATE_MESSAGE = "중복된 숫자가 입력되었습니다.";
	private static final String INVALID_NUMBER_MESSAGE = "1 또는 2만 입력해주세요.";
	private static final String REPLAY_NUMBER = "1";
	private static final String TERMINATE_NUMBER = "2";

	public static void validatePlayerNumber(String playerNumber) {

		if (!checkLength(playerNumber, VALID_NUMBER_LENGTH)) {
			throw new IllegalArgumentException(INVALID_LENGTH_MESSAGE);
		}
		if (!checkRange(playerNumber, VALID_MINIMUM_RANGE, VALID_MAXIMUM_RANGE)) {
			throw new IllegalArgumentException(INVALID_RANGE_MESSAGE);
		}
		if (!checkDuplicate(playerNumber)) {
			throw new IllegalArgumentException(INVALID_DUPLICATE_MESSAGE);
		}
	}

	public static void validateReplay(String number) {
		if (!(Objects.equals(number, REPLAY_NUMBER) || Objects.equals(number, TERMINATE_NUMBER))) {
			throw new IllegalArgumentException(INVALID_NUMBER_MESSAGE);
		}
	}

	public static boolean checkLength(String playerNumber, int validLength) {
		return (playerNumber.length() == validLength);
	}

	public static boolean checkRange(String playerNumber, int minimumRange, int maximumRange) {
		char[] playerArray = playerNumber.toCharArray();
		for (int i = MINIMUM_INDEX; i <= MAXIMUM_INDEX; i++) {
			if (playerArray[i] < minimumRange || playerArray[i] > maximumRange) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDuplicate(String playerNumber) {
		return (Arrays.stream(playerNumber.split("")).distinct().count() == playerNumber.length());
	}
}
