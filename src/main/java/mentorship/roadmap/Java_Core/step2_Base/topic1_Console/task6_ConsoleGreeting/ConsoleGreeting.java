package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task6_ConsoleGreeting;

import java.util.Scanner;

public class ConsoleGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.printf("Привет, %s! Добро пожаловать в Java", message);
    }
}
