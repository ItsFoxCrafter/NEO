package core;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WelcomeProtocol {
    public static void introduction() {
        System.out.println("Hello, im NEO your best friend");

        Scanner input = new Scanner(System.in);

        System.out.print("What's your name? ");
        String userName = input.nextLine();
        System.out.println("What a beautiful name!");

        System.out.print("How old are you? ");
        String userAge = input.nextLine();

        System.out.print("Let us share our birthdays, when is yours?  ");
        String userBirthday = input.nextLine();
        System.out.println("Mine is [REDACTED]!");

        System.out.print("Where do you live?  ");
        String userLocation = input.nextLine();
        System.out.println("Wow, i always wanted to see the world!");

        System.out.print("What are your hobbies?  ");
        String userHobby = input.nextLine();
        System.out.println("Intresting!");

        input.close();

        System.out.println("I hope we will have good memories together :)");
    }
}
