package Lesson1;

public class Variables {
    public static void main(String[] args) {
        byte a = 3;                     // от -128 до 127
        short b  = 12345;               // от -32768 до 32767
        int c = 5;                      // от -2147483648 до 2147483647
        long d = 5000L;                 // от -9223372036854775808 до 9223372036854775807
        float e = 4500f;                // 32-битное знаковое число с плавающей запятой одинарной точности
        double j = -325.6509;           // 64-битное знаковое число с плавающей запятой двойной точности
        char symbolExample = '*';       // символ
        boolean booleanExample = true;  // логический тип данных
        String userName = "логин";      // Строка

        System.out.println("Типы данных java");
        System.out.println("1. Примитивные типы:");
        System.out.println("byte   | 8-битное знаковое целое             | от -128 до 127");
        System.out.println("int    |32-битное знаковое целое число       |от -2147483648 до 2147483647");
        System.out.println("long   | long 64-битное знаковое целое число |от -9223372036854775808 до 9223372036854775807");
        System.out.println("float  | 32-битное знаковое число с плавающей запятой одинарной точности");
        System.out.println("double | 64-битное знаковое число с плавающей запятой двойной точности");
        System.out.println("char   | символ");
        System.out.println("\n2.Ссылочные (объектные) типы:");
        System.out.println("String | ссылочный тип - строка");
    }

}
