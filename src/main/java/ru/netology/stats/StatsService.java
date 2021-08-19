package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int result =0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int averageSum(int[] sales) {
        int sum = sum(sales);
        int result = sum / sales.length;
        return result;
    }

    public int maxMonth(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        int monthCount = 0;
        int maxMonth = 0;
        for (int sale : sales) {
            monthCount ++;
            if (sale == max) {
                maxMonth = monthCount;
            }
        }
        return maxMonth;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int monthLessThanAvg(int[] sales) {
        int avg = averageSum(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (sale > avg) {
                monthCount ++;
            }
        }
        return monthCount;
    }

    public int monthMoreThanAvg(int[] sales) {
      int avg = averageSum(sales);
      int monthCount = 0;
        for (int sale : sales) {
            if (sale < avg) {
                monthCount ++;
            }
        }
        return monthCount;
    }
}


