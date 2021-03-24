package service;

import org.junit.Test;
import service.SnakeAndLadderService;

public class SnakeAndLadderServiceShould {
    SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();

    //test cases should not throw any exception
    @Test
    public void startGamewithcrookeddice() {
        snakeAndLadderService.startGame(true);
    }

    @Test
    public void startGamewithoutcrookeddice() {
        snakeAndLadderService.startGame(false);
    }

}
