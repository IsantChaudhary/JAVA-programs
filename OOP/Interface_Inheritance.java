package OOP;

interface defaultRunnable extends Runnable {
    void displayDetails();
}

class machine implements defaultRunnable {
    @Override
    public void run() {
        System.out.println("Machine Running...");
    }

    @Override
    public void displayDetails() {
        System.out.println("No details to display...");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {

        machine m1 = new machine();
        m1.run();
        m1.displayDetails();

        System.out.println();

        defaultRunnable m2 = new machine();
        m2.run();
        m2.displayDetails();
    }
}
