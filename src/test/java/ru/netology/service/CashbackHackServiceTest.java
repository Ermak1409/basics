package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain800() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = CashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
