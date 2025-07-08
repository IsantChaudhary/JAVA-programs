package strings_and_conditionals;

import java.util.Scanner;

public class Celcius_to_Fahrenheit {
    public static void main(String[] args) {

        System.out.print("Enter Degrees in Celsius : ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheit = ( celsius * 1.8) + 32.0 ;

        System.out.printf("%.3f degrees in Celsius is %.3f degrees in Fahrenheit",celsius,fahrenheit);
    }
}
