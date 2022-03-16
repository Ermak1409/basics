package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain800() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 800;

        int actual = CashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(expected,actual);
    }
    @Test
    public void remain1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = CashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }
}