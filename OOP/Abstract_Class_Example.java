package OOP;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Running");
    }
}

public class Abstract_Class_Example {

    public static void main(String[] args) {

        Timer timer = new Timer();

        timer.scheduleAtFixedRate(
                new MyTask(),
                0L,
                1000L
        );
    }
}