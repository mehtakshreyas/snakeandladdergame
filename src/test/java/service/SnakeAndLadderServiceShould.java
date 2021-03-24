package service;

import org.junit.Test;
import service.SnakeAndLadderService;

public class SnakeAndLadderServiceShould {
    SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();

    //This should not throw any exception
    @Test
    public void startGame() {
        snakeAndLadderService.startGame();
    }

}
