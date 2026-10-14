package Enumerations;

            //Enum Constructor — Notes
            //Each enum constant is an object of the enum type.
            //Values can be passed to an enum constant using APPLE("Red").
            //The value is passed to the enum constructor.
            //The constructor stores the value in the enum's variable using this.
            //        this refers to the specific enum constant/object being created.
            //        Example: APPLE("Red") → this.color = "Red" → APPLE.color becomes "Red".
            //This allows each enum constant to have its own fixed value.


enum Fruits {
    APPLE("Red"), ORANGE("Orange"), BANANA("Yellow");

    private final String color;

    Fruits(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + color + ")";
    }
}

public class Enum_Constructors {
    public static void main(String[] args) {

        System.out.println(Fruits.APPLE);
    }
}
