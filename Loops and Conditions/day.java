package strings_and_conditionals;
import java.util.Scanner;

public class day {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no. to know the day ");
        int day = sc.nextInt();

        switch (day){
                case 1 :
                System.out.println("Monday");
                break ;

                case 2 :
                System.out.println("Tuesday");
                break ;

                case 3 :
                System.out.println("wednesday");
                break ;

                case 4 :
                System.out.println("thursday");
                break ;

                case 5 :
                System.out.println("friday");
                break ;

                case 6 :
                System.out.println("saturday");
                break ;

                case 7 :
                System.out.println("sunday");
                break ;

            default:
                System.out.println("you have entered the wrong number...");

        }
    }
}
