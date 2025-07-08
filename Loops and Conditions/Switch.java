package Loops_and_Conditions;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int greet = scanner.nextInt();
        scanner.close();
        switch (greet) {
            case 1:
                System.out.println("Good Morning");
                break;
            case 2:
                System.out.println("Good Afternoon");
                break;
            case 3:
                System.out.println("Good Night");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
