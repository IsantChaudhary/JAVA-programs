package Loops_and_Conditions;

import java.util.Scanner;

public class Checking_Password {
    public static void main(String[] args) {

        final String User_Password = "Ishant";
        boolean AccessGranted = false ;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the password : ");
            String input = scanner.nextLine();

            if (input.equals(User_Password)) {
                System.out.println("Access Granted");
                AccessGranted = true ;
                break;
            } else {
                System.out.println("Incorrect Password");
            }
        }
        if(!AccessGranted)
        System.out.println("Access Denied");
    }
}
