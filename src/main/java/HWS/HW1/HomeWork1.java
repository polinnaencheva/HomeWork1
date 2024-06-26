package HWS.HW1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Hello what's your name?");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!Nice to meet you!");

        System.out.println( "What's your hobby?");

        String hobby = scanner.nextLine();

        System.out.println("I am " +userName + " and " + hobby + " is my hobby!");
    }
}


