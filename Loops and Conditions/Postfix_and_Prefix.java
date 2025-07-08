package Loops_and_Conditions;

public class Postfix_and_Prefix {
    public static void main(String[] args) {

        int cats = 5 ;
        System.out.println(cats++);
        System.out.println(cats);

        int dogs = 7 ;
        System.out.println(++dogs);

        int giraffes = 10 ;
        int elephants = 5 ;

        int animals = cats + dogs + giraffes++ + --elephants ;
        System.out.println(animals);
    }
}
