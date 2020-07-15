package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

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