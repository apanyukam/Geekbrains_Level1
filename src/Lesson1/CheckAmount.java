package Lesson1;
/*
Задача 4: Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
*/

import java.util.Scanner;

public class CheckAmount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Метод  проверяет, лежит ли сумма чисел в диапозоне от 10 до 20.");
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Результат: " + resultSum(c));


    }
    public static boolean resultSum(int c){
        boolean result;
        result = c >= 10 && c <= 20;
        return result;
    }
}
