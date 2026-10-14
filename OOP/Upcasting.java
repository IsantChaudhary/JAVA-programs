package OOP;

class Animal {
    public void sound() {
        System.out.println("Animals makes sound...");
    }
}

class Dog extends Bird {  // This is subclassed by Bird class present in Downcasting.java
    @Override
    public void sound() {
        System.out.println("Dog Barking...");
    }
}

public class Upcasting {
    public static void main(String[] args) {

        Bird a1 = new parrot();  // Upcasting (Dog → Animal)
        a1.sound();             // Calls Dog's overridden method at runtime
    }
}
