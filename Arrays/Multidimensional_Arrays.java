package Arrays;

public class Multidimensional_Arrays {
    public static void main(String[] args) {

        int [][] numbers = {
                {1,2,3},
                {4,5,},
                {6,7,8},
        };

        for(int i=0 ; i< numbers.length ; i++){
            for(int j=0 ; j< numbers[i].length ; j++){
                System.out.printf("%d \t" , numbers[i][j]);
            }
            System.out.println();
        }

        int total = 0 ;
        for(int i=0 ; i< numbers.length ; i++){
            System.out.println(numbers[i][i]);
            total += numbers[i][i];
        }
        System.out.println("Total is : " + total);
    }
}
