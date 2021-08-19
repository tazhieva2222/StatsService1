package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {

        int actual = service.sum(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSum() {

        int actual = service.averageSum(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMonthMaxSale() {

        int actual = service.maxMonth(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberMonthMinSale() {

      int actual = service.minMonth(sales);
      int expected = 9;
        assertEquals( expected, actual);
    }

    @Test
    void shouldNumberOfMonthLessThanAvg() {

        int actual = service.monthLessThanAvg(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }


    @Test
    void shouldNumberOfMonthMoreThanAvg() {

        int actual = service.monthMoreThanAvg(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}