package Inheritance;

class Cat {
    public void vocalize() {
        System.out.println("Meow Meow...");
    }
}

class Tiger extends Cat {
    public void vocalize() {
        System.out.println("Roar...");
    }
}

public class Inheritance_and_Overriding_Methods {
    public static void main(String[] args) {

        Tiger t1 = new Tiger();
        t1.vocalize();
    }
}
