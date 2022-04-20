package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int year = 2015;
        isYearLeap(year);
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        getClientOS (clientOS, year);
    }
    public static void isYearLeap(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
    public static void getClientOS(int clientOS, int year) {
        if (clientOS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if
        (clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && year >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if
        (clientOS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }
    public static void task3() {
        // Здесь пишем код первого задания
    }
    public static void task4() {
        // Здесь пишем код первого задания
    }
    public static void task5() {
        // Здесь пишем код первого задания
    }
}
