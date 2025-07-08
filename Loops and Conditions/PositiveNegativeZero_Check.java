package strings_and_conditionals;

import java.util.Scanner;

public class PositiveNegativeZero_Check {
    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();

        if(num>0){
            System.out.println("Positive Number");
        }
        else if (num<0){
            System.out.println("Negativer Number");
        }
        else{
            System.out.println("Its a Zero");
        }
    }
}
