package Arrays;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {

        final int NUM_VALUE = 3;
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[NUM_VALUE];
        for (int i = 0; i < NUM_VALUE; i++) {
            System.out.print("Enter the numbers : ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("you entered : ");
        int total = 0;

        for (int i = 0; i < NUM_VALUE; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total is : " + total);
    }
}
