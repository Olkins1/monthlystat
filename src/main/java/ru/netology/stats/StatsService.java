package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = 0;
        int count = 0; // счётчик количества месяцев
        for (long sale : sales) {
            sum += sale;
            count += 1;
        }
        return sum / count;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lessThanAverageCount(long[] sales) {
        int average = averageSales(sales);
        int lessThanAverage = 0;
        for (long sale : sales) {
            if (sale < average) {
                lessThanAverage += 1;
            }
        }
        return lessThanAverage;
    }

    public int moreThanAverageCount(long[] sales) {
        int average = averageSales(sales);
        int moreThanAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                moreThanAverage += 1;
            }
        }
        return moreThanAverage;
    }
}

