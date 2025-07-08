package Arrays;

public class Primitive_Nonprimitive_Arrays {
    public static void main(String[] args) {

        int [] numbers = new int [5];

        numbers[0] = 1 ;
        numbers[1] = 2 ;
        numbers[2] = 3 ;
        numbers[3] = 4 ;
        numbers[4] = 5 ;

        for(int i=0 ; i< numbers.length ; i++){
            System.out.println(numbers[i]);
        }

        String [] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "banana";

        for(int i=0 ; i< fruits.length ; i++){
            System.out.println(fruits[i]);
        }

    }
}
