package Loops_and_Conditions;

public class Increment_and_Decrement {
    public static void main(String[] args) {

        int count = 0 ;
        System.out.println("Count: " + count);

        count = count + 1 ;
        System.out.println("Count: " + count);

        count += 1 ;
        System.out.println("Count: " + count);

        count++ ; // postfix version of increment operator
        System.out.println("Count: " + count);

        ++count ; // prefix version of increment operator
        System.out.println("Count: " + count);

        count = count - 1 ;
        System.out.println("Count: " + count);

        count -= 1 ;
        System.out.println("Count: " + count);

        count-- ; // postfix version of decrement operator
        System.out.println("Count: " + count);

        --count ; //prefix version of decrement operator
        System.out.println("Count: " + count);
    }
}
