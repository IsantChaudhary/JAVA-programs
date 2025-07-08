package Loops;

import java.util.Scanner;

public class Password_Check {
    public static void main(String[] args) {

        final String PASSWORD = "MESSI";
        boolean accessGranted = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter the password : ");
            String codeword = scanner.nextLine();
            if (codeword.equals("MESSI")) {
                accessGranted = true;
                break;
            } else {
                System.out.println("Incorrect password");
            }
        }
        scanner.close();
        if (accessGranted) {
            System.out.println("ACCESS GRANTED");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}
