package service;

import java.util.Random;

public class DiceService {
    /*
    * roll method will give number from 1 to 6
     */
    public static int roll(boolean crookedDice) {
        return crookedDice ? (new Random().nextInt(3) + 1) * 2 : new Random().nextInt(6) + 1 ;
    }
}
