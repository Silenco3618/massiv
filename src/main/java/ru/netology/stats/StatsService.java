package ru.netology.stats;

import static java.lang.Math.round;

public class StatsService {

    public int SummaAllSalls(long[] allSales) {
        //Сумма всех продаж
        int sum = 0;
        for (int i = 0; i < allSales.length; i++) {
            sum = (int) (sum + allSales[i]);
        }
        return sum;
    }

    public int UpAvarage(int[] sales) {
        //Средняя сумма продаж в месяц
        long avarage = 0;
        int sum = 0;
        for (long i = 0; i < sales.length; i++) {
            sum += sales[(int) i];
        }
        avarage = sum / sales.length;
        return Math.round(avarage);
    }

    public int minSales(long[] sales) {
        //Номер месяца, в котором продаж осуществлены на минимальную сумму
        int minMonth = 0;
        int month = 0;// переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] salesMax) {
        //Номер месяца, в котором продаж осуществлены на максимальную сумму
        int maxMonth = 0;
        int month = 0;// переменная для индекса рассматриваемого месяца в массиве
        for (long sale : salesMax) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце

            if (sale <= salesMax[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth;
    }

    public int downAverage(int[] month) {
        //Количество месяцев, в которых продажи были ниже среднего

        int variable = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] < UpAvarage(month)) {

                variable++;
            }
        }
        return variable;
    }

    public int upAverage(int[] month) {
        //Количество месяцев, в которых продажи были выше среднего
        int variable = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] > UpAvarage(month)) {
                variable++;
            }
        }
        return variable;
    }


}
