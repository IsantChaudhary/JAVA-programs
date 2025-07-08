package strings_and_conditionals;
import java.util.Scanner ;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of physics ");
        int physics = sc.nextInt() ;
        System.out.println("Enter marks of chemistry ");
        int chemistry = sc.nextInt() ;
        System.out.println("Enter marks of math ");
        int math = sc.nextInt() ;

        float average = (physics + chemistry + math) / 3.0f;
        System.out.println("your average marks is " + average);

        if(average >= 40 && physics >= 33 && chemistry >= 33 && math >= 33){
            System.out.println("you are passed");
        }else{
            System.out.println("you are fail");
        }
    }

}
