package Loops;

import java.util.Scanner;

public class FibonacciSeires {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        if (num == 0) {
            System.out.println("Please...Enter a positive integer greater than 0 ");
            return;
        }

        int a = 0;
        int b = 1;

        if (num == 1) {
            System.out.println("Fibonacci Sequence up to " + num + " : " + a);
        } else {
            System.out.print("Fibonacci Sequence up to " + num + " : ");
            System.out.print(a + " " + b + " ");

            for (int i = 3; i <= num; i++) {
                int next = a + b;
                System.out.print(next + " ");

                a = b;
                b = next;
            }
        }
    }
}
