package Inner_Classes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Local_Inner_Classes_Example {

    private String name;

    public Local_Inner_Classes_Example() {
        name = "Henry";
    }

    public static void main(String[] args) {
        new Local_Inner_Classes_Example().run();
    }

    private void run() {

        class Printer implements Runnable {

            public void print() {
                System.out.println(Local_Inner_Classes_Example.this.name);
            }

            @Override
            public void run() {
                print();
            }
        }

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new Printer(), 0L, 1L, TimeUnit.SECONDS);
    }
}
