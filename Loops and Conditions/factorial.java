package Loops;
import java.util.Scanner ;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        int factorial = 1 ;
        for(int i=n ; i>=1 ; i--){
            factorial = factorial * i ;
        }
        System.out.println(factorial);
    }
}
