package OOP;

interface defaultRunnables extends Runnable {
    void showDetails();
    default void info(){
        System.out.println("Information");
    }
}

class device implements defaultRunnables {
    @Override
    public void run() {
        System.out.println("Device Running...");
    }

    @Override
    public void showDetails() {
        System.out.println("No details to display...");
    }

    public void info(){
        System.out.println("information...");
    }
}

public class Interface_Default_Methods {
    public static void main(String[] args) {

        device d1 = new device();
        d1.run();
        d1.showDetails();
        d1.info();
    }
}
