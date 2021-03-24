package service;

import dto.Snake;
import dto.SnakeAndLadderBoard;

import java.util.ArrayList;
import java.util.List;

public class SnakeAndLadderService {
    private static final int DEFAULT_BOARD_SIZE = 100;
    private int playerpostion;
    SnakeAndLadderBoard snakeAndLadderBoard = new SnakeAndLadderBoard(DEFAULT_BOARD_SIZE);

    private boolean isGameCompleted() {
         return playerpostion == 100;
    }

    private void movePlayer(int diceNumer){
        playerpostion = (playerpostion + diceNumer > 100) ? playerpostion : playerpostion + diceNumer;
        for(Snake snake : snakeAndLadderBoard.getSnakes() ){
            if(snake.getStart() == playerpostion){
                playerpostion = snake.getEnd();
            }
        }
    }

    private void gameinitialization(){
        Snake snake = new Snake(7,14);
        List<Snake> snakes = new ArrayList<>();
        snakes.add(snake);
        snakeAndLadderBoard.setSnakes(snakes);
    }

    public void startGame(boolean shouldGameStartwithcrookedDice) {
        gameinitialization();
        while (!isGameCompleted()) {
            int totalDiceValue = DiceService.roll(shouldGameStartwithcrookedDice);
            movePlayer(totalDiceValue);
        }
    }
}
