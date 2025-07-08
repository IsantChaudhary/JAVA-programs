package Loops;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String string = scanner.nextLine();
        scanner.close();
        string = string.toLowerCase();

        int i = 0;
        int count = 0;
        while (i < string.length()) {

            char ch = string.charAt(i);
            i++;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.print("Numbers of vowel is : " + count);
    }
}
