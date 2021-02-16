package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService variable = new StatisticService();

        long[] incomesInEuro = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long predicted = 12;

        long actual = variable.findMax(incomesInEuro);

        assertEquals(predicted,actual);
    }
@Test
    void findMax2() {
        StatisticService variable = new StatisticService();

        long[] incomesInEuro = {5, 12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long predicted = 12;

        long actual = variable.findMax(incomesInEuro);

        assertEquals(predicted,actual);
    }
}