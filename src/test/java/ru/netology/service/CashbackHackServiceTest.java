package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test

    public void minimumPurchaseAmount() {
        int amount = 1;
        int expected = 999;
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void equivalentPurchaseAmount(){
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void averagePurchaseAmount(){
        int amount = 500;
        int expected = 500;
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void randomPurchaseAmount(){
        int amount = 288;
        int expected = 712;
        CashbackHackService cashbackHackService = new CashbackHackService();

        int actual = cashbackHackService.remain(amount);

        assertEquals(actual, expected);

    }

}