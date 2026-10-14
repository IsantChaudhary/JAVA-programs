package Overloading_Methods_and_Constructors;

class HumanBeing {

    private final String name;

    public HumanBeing(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hello";
    }
}

public class Default_Constructors {
    public static void main(String[] args) {

        //HumanBeing h = new HumanBeing();
        //System.out.println(h);

        HumanBeing h1 = new HumanBeing("Ram");
        System.out.println(h1);
    }
}
