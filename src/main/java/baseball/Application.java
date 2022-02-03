package baseball;

import baseball.controller.GameController;
import baseball.model.HintService;
import baseball.model.HintServiceImpl;
import baseball.model.NumberService;
import baseball.model.NumberServiceImpl;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        // 의존관계를 단방향으로 함이 좋다.
        // GameController -> HintService <-> NumberService 보다는
        // GameController -> HintService
        // GameController -> NumberService
        HintService hintService = new HintServiceImpl();
        NumberService numberService = new NumberServiceImpl();
        GameController gameController = new GameController(hintService, numberService);
        gameController.controlGame();
    }
}
