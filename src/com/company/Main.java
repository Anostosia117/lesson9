package com.company;
import java.util.Arrays;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2015;
        isYearLeap(year);
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        getClientOS(clientOS, year);
        int deliveryDistance = 66;
        int deliveryDays = 1;
        sumDistance(deliveryDistance, deliveryDays);
        String letters = "aabccddefgghiijjkk";
        getRepeat(letters);
        int[] arr = {3, 2, 1, 6, 5};
        getReverse(arr);
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
    public static void sumDistance(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if
        (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if
        (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        }
    }
    public static void getRepeat(String letters) {
        for (int i = 0; i < letters.length() - 1; i++) {
            if (letters.lastIndexOf(letters.charAt(i)) != i) {
                System.out.print("В строке есть повторения буквы " + letters.charAt(i));
                break;
            }
        }
        System.out.println();
    }
    public static void getReverse(int[] arr) {
        for (int i = arr.length - 1;i >=0;i--) {
            if (i >= 1) {
                System.out.print(arr[i] + ", ");
            } else
                System.out.println(arr[i]);
        }
    }
}
