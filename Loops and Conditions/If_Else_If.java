package Loops_and_Conditions;

import java.util.Scanner;

public class If_Else_If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value in Fahrenheit to convert : ");
        double fahrenheit = scanner.nextFloat();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf(" %.2f degrees Fahrenheit is %.2f degrees Celsius", fahrenheit, celsius);

        System.out.println();

        if (celsius == 37) {
            System.out.println("Normal");
        } else if (celsius < 37) {
            System.out.println("cool");
        } else {
            System.out.println("Feeling warm");
        }
    }
}