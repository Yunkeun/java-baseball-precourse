package baseball;

import baseball.hint.HintService;
import baseball.hint.HintServiceImpl;
import baseball.number.Generator;
import baseball.number.NumberService;
import baseball.number.NumberServiceImpl;
import baseball.number.PlayerNumber;
import baseball.number.RandomNumber;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        RandomNumber randomNumber = Generator.generateRandomNumber();
        System.out.println("randomNumber = " + randomNumber.getRandomNumber());
        PlayerNumber playerNumber = Generator.generatePlayerNumber();
        HintService hintService = new HintServiceImpl(playerNumber, randomNumber);
        NumberService numberService = new NumberServiceImpl(hintService);
        numberService.compareNumbers(playerNumber, randomNumber);
    }
}
