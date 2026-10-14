package Overloading_Methods_and_Constructors;

class Person {
    public void greet() {
        System.out.println("hello");
    }

    public void greet(String name) {
        System.out.println("hello " + name);
    }
}

public class Method_Overloading {
    public static void main(String[] args) {

        Person person = new Person();
        person.greet();
        Persons person1 = new Persons();
        person.greet("ram");
    }
}
