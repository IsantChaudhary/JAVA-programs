package Inheritance;

class Cat1 {
    public void vocalize() {
        System.out.println("Meow Meow...");
    }
}

class Tiger1 extends Cat1 {
    @Override
    public void vocalize() {
        System.out.println("Roar...");
    }
}
public class Override_Annotation {
    public static void main(String[] args) {

        Tiger1 t1 = new Tiger1();
        t1.vocalize();
    }
}
