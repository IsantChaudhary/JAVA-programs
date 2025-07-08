package strings_and_conditionals;

import java.util.Scanner;

public class Grade_Report {
    public static void main(String[] args) {

        System.out.print("Enter the scored marks out of 100  : ");
        Scanner scanner = new Scanner(System.in);
        double marks = scanner.nextDouble();

        if(marks>90 && marks <= 100){
            System.out.println("O Grade");
        }
        else if(marks>80 && marks <= 90){
            System.out.println("E Grade");
        }
        else if(marks>70 && marks <=80){
            System.out.println("A Grade");
        }
        else if(marks>60 && marks <= 70){
            System.out.println("B Grade");
        }
        else if(marks>=50 && marks <= 60){
            System.out.println("C Grade");
        }
        else{
            System.out.println("You are fail...");
        }

    }
}
