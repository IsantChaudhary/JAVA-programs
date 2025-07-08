package strings_and_conditionals;

import java.util.Scanner;

public class Vowel_or_Consonat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if (Character.isLetter(ch)) {

            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Its a vowel letter");
            } else {
                System.out.println("Its a consonant letter");
            }
        }
    }
}
