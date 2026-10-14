package OOP;

interface speaker {
    void speak();
}

interface greeter {
    void greet();
}

class snake implements speaker, greeter {
    @Override
    public void greet() {
        System.out.println("greeting...");
    }

    @Override
    public void speak() {
        System.out.println("Hello...");
    }
}







public class Multiple_Inheritance {
    public static void main(String[] args) {

        snake anaconda = new snake();
        anaconda.speak();
        anaconda.greet();
    }
}
