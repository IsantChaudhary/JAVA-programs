package OOP;

class Bird {
    public void sound() {
        System.out.println("Birds makes sound...");
    }
}

class parrot extends Bird {
    @Override
    public void sound() {
        System.out.println("parrot sound...");
    }
}

public class Downcasting {
    public static void main(String[] args) {

        Bird a1 = new parrot();
        parrot a2 = (parrot) a1; // Downcasting (bird -> parrot)
        a1.sound();
    }
}
