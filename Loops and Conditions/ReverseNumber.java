package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        int reversedNumber = 0 ;

        while(num != 0){
            int digits = num % 10 ;
            reversedNumber = reversedNumber * 10 + digits ;
            num = num / 10 ;
        }
        System.out.println("Reversed number is : " + reversedNumber);
    }
}
