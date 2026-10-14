package Enumerations;

// --> Taken enum from Enum.java

public class Enum_Methods {
    public static void main(String[] args) {

        for (Fruit fruit : Fruit.values()) { //-> helps to print values
            System.out.println(fruit);
        }

        System.out.println(Fruit.ORANGE.ordinal()); // --> tells position
        System.out.println(Fruit.APPLE.ordinal());

        Fruit f4 = Fruit.valueOf("ORANGE");  // --> converts a string to enum constant
                                                   // and it is Case sensitive
        System.out.println(f4);

        System.out.println(f4 == Fruit.ORANGE);
    }
}
