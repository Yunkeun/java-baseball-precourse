package baseball.view.printstrategy;

import baseball.model.HintType;

public class PrintStrategyKor implements PrintStrategy {

	private static final String STRIKE_KOR = "스트라이크";
	private static final String BALL_KOR = "볼";
	private static final String NOTHING_KOR = "낫싱";

	@Override
	public String getHintType(HintType hintType) {
		if (HintType.Strike.equals(hintType)) {
			return STRIKE_KOR;
		}
		if (HintType.Ball.equals(hintType)) {
			return BALL_KOR;
		}
		return NOTHING_KOR;
	}
}
