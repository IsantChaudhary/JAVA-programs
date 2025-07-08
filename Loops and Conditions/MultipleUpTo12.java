package Loops;

public class MultipleUpTo12 {
    public static void main(String[] args) {

        int[][] table = new int[12][12];

        for (int i = 0; i < table.length; i++) {
            int[] row = table[i];
            for (int j = 0; j < row.length; j++) {
                row [j] = (i+1) * (j+1) ;
            }
        }
        for (int [] row : table){
            for (int value : row){
                System.out.print( " " + value);
            }
            System.out.println();
        }
    }
}

