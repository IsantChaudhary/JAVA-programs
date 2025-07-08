package strings_and_conditionals;

import java.util.Scanner;

public class Div_By_2and3 {
    public static void main(String[] args) {

        System.out.print("Enter the number in integer : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.println("Given number is divisible by 2 and 3 ");
        } else {
            System.out.println("Given number is not divisible by 2 and 3 ");
        }
    }
}
