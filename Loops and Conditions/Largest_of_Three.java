package strings_and_conditionals;

import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = scanner.nextInt();

        scanner.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is greater");
        } else {
            System.out.println("Number 3 is greater");
        }
    }
}
