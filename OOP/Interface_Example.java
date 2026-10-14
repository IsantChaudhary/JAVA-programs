package OOP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class task implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class Interface_Example {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new task(), 0L, 1L, TimeUnit.SECONDS);
    }
}
