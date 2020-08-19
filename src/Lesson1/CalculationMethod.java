package Lesson1;

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

        Calculation(a,b,c,d);

    }

    public static void Calculation (double a, double b, double c, double d){
        double result = a * (b + (c / d));
        System.out.println("a * (b + (c / d)) = " + result);

    }
}
