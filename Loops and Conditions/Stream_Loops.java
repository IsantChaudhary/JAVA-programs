package Loops_and_Conditions;

import java.util.stream.IntStream;

public class Stream_Loops {
    public static void main(String[] args) {

        IntStream.range(0,5).forEach(i->{
            System.out.println(i);
        });
    }
}
