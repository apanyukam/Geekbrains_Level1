package Lesson1;

/*
Задача 7: Написать метод, которому в качестве параметра передается строка,
обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
 */

import java.util.Scanner;

public class MessageName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как Вас зовут?\n");
        String userName = scanner.nextLine();
        System.out.println(messageForConsole(userName));

    }
    public static String messageForConsole(String userName){
        String  messageForUser = "Привет, " + userName + "!";
        return messageForUser;
    }
}
