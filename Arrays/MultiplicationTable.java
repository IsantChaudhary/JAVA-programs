package Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] table = new int[12][12];
        for (int i = 0; i < table.length; i++) {
            int[] row = table[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = (i + 1) * (j + 1);
            }
        }
        for (int[] row : table) {  // note applies here
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        /*Enhanced for Loop & 2D Arrays - Notes
In an enhanced for loop, the variable before : must match the type of one element stored in the array.

A String[] array stores String elements, so use for (String fruit : fruits).

An int[][] array stores int[] (row) arrays, not int values, so use for (int[] row : table).

After getting each row (int[]), use another enhanced for loop: for (int value : row) to access each integer.

Easy trick: Check what array[index] returns—that is the type you write before the :.
fruits[0] → String → for (String fruit : fruits)
table[0] → int[] → for (int[] row : table)

         */
    }
}
