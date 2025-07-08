package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        while (num != 0) {
            sum += num % 10; // adds the remainder to the sum
            num = num / 10; // removes the last digit of the number
        }
        System.out.println("Total sum is : " + sum);
    }
}
