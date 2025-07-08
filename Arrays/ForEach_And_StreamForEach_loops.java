package Arrays;

import java.util.Arrays;
public class ForEach_And_StreamForEach_loops {
    public static void main(String[] args) {

        String [] fruits = {"apple","orange","banana"};

        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println();

        Arrays.stream(fruits).forEach(fruit ->{
            System.out.println(fruit);
        });
    }
}
