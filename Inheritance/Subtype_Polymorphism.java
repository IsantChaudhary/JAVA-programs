package Inheritance;

class Cat2 {
    public void vocalize() {
        System.out.println("Meow Meow...");
    }
}

class Tiger2 extends Cat2 {
    @Override
    public void vocalize() {
        System.out.println("Roar from Tiger2...");
    }

    public void Hunt () {
        System.out.println("hunting");
    }
}

class Tiger3 extends Cat2 {
    @Override
    public void vocalize() {
        System.out.println("Roar from Tiger3...");
    }
}

public class Subtype_Polymorphism {
    public static void main(String[] args) {

        Cat2 t1 = new Tiger2();
        t1.vocalize();

        ((Tiger2)t1).Hunt(); // casting

        Cat2[] cats = {new Tiger2(), new Tiger3()};

        for (Cat2 c : cats) {
            c.vocalize();
        }
    }
}
