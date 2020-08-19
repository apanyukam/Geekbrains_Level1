package Lesson1;
/*
Задача 3: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – входные параметры этого метода.
Проверку на вводимые символы не делал.
 */

import java.util.Scanner;

public class CalculationMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа расчитает значение выражения a * (b + (c / d))" +
                "\nВведите любые числа поочередно.\n");
        System.out.println("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c: ");
        double c = scanner.nextDouble();
        System.out.println("Введите значение d: ");
        double d = scanner.nextDouble();

        System.out.println("a * (b + (c / d)) = " + Calculation(a,b,c,d));

    }

    public static double Calculation (double a, double b, double c, double d){
        return a * (b + (c / d));
    }
}
