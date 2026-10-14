package Inner_Classes;

class Human {
    private final String name = "toto";

    public void start() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Human.this.name);
            }
        };
        activate(runnable);

        activate(new Runnable() {
            @Override
            public void run() {
                System.out.println(name);
            }
        });
    }

    public void activate(Runnable runnable) {
        runnable.run();
    }
}

public class Anonymous_Classes {
    public static void main(String[] args) {

        new Human().start();
    }
}
