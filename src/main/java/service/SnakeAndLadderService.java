package service;

public class SnakeAndLadderService {
    private static final int DEFAULT_BOARD_SIZE = 100;
    private int playerpostion;

    private boolean isGameCompleted() {
         return playerpostion == 100;
    }

    private void movePlayer(int diceNumer){
        playerpostion = (playerpostion + diceNumer > 100) ? playerpostion : playerpostion + diceNumer;
    }
    public void startGame() {
        DiceService diceService = new DiceService();
        while (!isGameCompleted()) {
            int totalDiceValue = diceService.roll();
            movePlayer(totalDiceValue);
        }
    }
}
