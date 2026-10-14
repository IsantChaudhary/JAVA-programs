package Overloading_Methods_and_Constructors;

class Persons {
    private static final String NO_NAME = "[Not Supplied]";
    private final String name;
    private final int age;


    public Persons() {
        this(NO_NAME, 0);
    }

    public Persons(String name) {
        this(name, 0);
    }

    public Persons(int age) {
        this(NO_NAME, age);
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Running main constructor");
    }

    public String toString() {
        return "Name is : " + name + " " + "and Age is : " + age;
    }
}

public class Constructor_Chaining {
    public static void main(String[] args) {

        Persons persons = new Persons("Ram", 24);
        System.out.println(persons);
        System.out.println();

        Persons persons1 = new Persons(24);
        System.out.println(persons1);
        System.out.println();

        Persons persons2 = new Persons("Ram");
        System.out.println(persons2);
        System.out.println();

        Persons persons3 = new Persons();
        System.out.println(persons3);
        System.out.println();
    }
}
