package OOP;

class Fish {
    public String toString() {
        return "Swimming...";
    }
}

class Shark extends Fish {
    public String toString() {
        return "Shark Swimming...";
    }
}

public class Objects {
    public static void main(String[] args) {

        Shark megaladon = (Shark) getAnimal();
        System.out.println(megaladon);

    }

    public static Object getAnimal() {
        return new Shark();
    }

}
