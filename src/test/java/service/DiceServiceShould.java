package service;

import org.junit.Assert;
import org.junit.Test;

public class DiceServiceShould {
    DiceService diceService = new DiceService();
     @Test
    public void roll(){
        int num = diceService.roll();
        Assert.assertTrue(1 <= num && num <= 6);
    }
}
