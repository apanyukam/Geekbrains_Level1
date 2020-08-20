package Lesson1;
/*
Написать метод, который определяет является ли год високосным,
и выводит сообщение в консоль. Каждый 4-й год является високосным,
кроме каждого 100-го, при этом каждый 400-й – високосный.
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scannerConsole = new Scanner(System.in);
        System.out.println("Определение,является ли год високосным");
        System.out.println("Введите год: \n");
        int dateYear = scannerConsole.nextInt();
        System.out.println("Год " + dateYear + " - " + CheckYearForLeap(dateYear));

    }
    public static String CheckYearForLeap(int a){
        String result;
        if (a %100 == 0 && a %400 == 0 ) {
            result = "Високосный";
        } else if (a % 4 == 0 && a % 100 > 0) {
            result = "Високосный";
        }else if (a % 100 == 0) {
            result = "Не високосный";
        }else {
            result = "Не високосный";
        }
        return result;
    }
}
