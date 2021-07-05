package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceJunit5Test {

    @Test
    public void shouldCalculateCashbackIfAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 100;
        int actual = cashbackHackService.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashbackIfAmount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual);
    }
}