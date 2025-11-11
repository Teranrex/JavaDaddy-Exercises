package mentorship.roadmap.Java_Core.step2_Base.topic1_Console.task5_EchoWithMessage;

import java.util.Scanner;

public class EchoWithMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        System.out.printf("Вы ввели: %s. Спасибо!", message);
    }
}
