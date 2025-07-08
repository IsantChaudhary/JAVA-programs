package Strings_and_Texts;

public class Format_specifiers {
    public static void main(String[] args) {

        double fahrenheit = 99;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.printf(" %.2f degrees Fahrenheit is %.2f degrees Celsius", fahrenheit, celsius);
    }
}
