package ru.netology.stats;

public class StatsService {

    // Расчет суммы всех продаж
    public int sumOfAllMonths(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Расчет средней суммы продаж в месяц
    public int midSum(int[] sales) {
        return sumOfAllMonths(sales) / sales.length;
    }

    // Расчет номера месяца, в котором был пик продаж
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    // Расчет номера месяца, в котором был минимум продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    // Расчет кол-ва месяцев, в которых продажи были ниже среднего
    public int belowAverages(int[] sales) {
        int countMonth = 0;
        for (int sale : sales) {
            if (sale < midSum(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }

    // Расчет кол-ва месяцев, в которых продажи были выше среднего
    public int overAverages(int[] sales) {
        int countMonth = 0;
        for (int sale : sales) {
            if (sale > midSum(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
