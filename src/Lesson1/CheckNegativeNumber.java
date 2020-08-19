package Lesson1;
/*
Задача 5: Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль положительное ли число передали, или отрицательное;
Замечание: ноль считаем положительным числом.
 */
import java.util.Scanner;

public class CheckNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Метод проверяет положительное или отрицательное число.");
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        System.out.println("Вы ввели " + CheckNumber(a));


    }
    private static String CheckNumber(int a){
        String message;
        if (a > 0){
            message = "положительное число";
        } else message = "отрицательное число";
        return message;
    }
}
