package Loops;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        boolean isPRIME = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        if (num <= 1) {
            isPRIME = false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                isPRIME = false;
                break;
            }
        }

        if (isPRIME) {
            System.out.println("Its a prime number");
        } else {
            System.out.println("Its not a prime number");
        }
    }
}
