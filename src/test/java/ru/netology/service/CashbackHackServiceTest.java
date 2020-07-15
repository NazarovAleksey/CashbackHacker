package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void notEnoughToCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void theAmountOfCashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual);
    }
}