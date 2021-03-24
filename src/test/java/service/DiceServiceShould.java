package service;

import org.junit.Assert;
import org.junit.Test;

public class DiceServiceShould {
    DiceService diceService = new DiceService();
     @Test
    public void rollwithcrookeddice(){
        int num = diceService.roll(true);
        Assert.assertTrue(2 == num || num == 4 || num ==6);
    }

    @Test
    public void rollwithoutcrookeddice(){
        int num = diceService.roll(false);
        Assert.assertTrue(1 <= num && num <= 6);
    }
}
