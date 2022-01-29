package baseball;

import baseball.model.hint.HintService;
import baseball.model.hint.HintServiceImpl;
import baseball.model.number.Generator;
import baseball.model.number.NumberService;
import baseball.model.number.NumberServiceImpl;
import baseball.model.number.PlayerNumber;
import baseball.model.number.RandomNumber;

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
