package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldAllSalls() {//Сумма всех продаж

        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSell = 180;
        int actualAllSells = service.SummaAllSalls(allSales);
        Assertions.assertEquals(expectedSell, actualAllSells);

    }
    @Test
    public void shouldAvarage() {//Средняя сумма продаж в месяц

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAvarage = 15;
        int actualAvarageSells = (int) service.UpAvarage(sales);
        Assertions.assertEquals(expectedAvarage, actualAvarageSells);
    }
    @Test
    public void shouldFindBetweenEnds() {//Номер месяца, в котором продаж осуществлены на минимальную сумму

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSell = 9;
        int actualSell = service.minSales(sales);
        Assertions.assertEquals(expectedSell, actualSell);
    }

    @Test
    public void shouldFindBetweenEndsMax() {//Номер месяца, в котором продаж осуществлены на максимальную сумму

        StatsService service = new StatsService();
        long[] salesMax = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSellMax = 8;
        int actualSellMax = service.maxSales(salesMax);
        Assertions.assertEquals(expectedSellMax, actualSellMax);
    }
    @Test
    public void shouldFindDownAverage() {

        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDownAverage = 5;
        int actualDownAverage = service.downAverage(month);
        Assertions.assertEquals(expectedDownAverage, actualDownAverage);
    }
    @Test
    public void shouldFindUpperAverage() {

        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedUpperAverage = 5;
        int actualUpperAverage = service.upAverage(month);
        Assertions.assertEquals(expectedUpperAverage, actualUpperAverage);
    }
}

