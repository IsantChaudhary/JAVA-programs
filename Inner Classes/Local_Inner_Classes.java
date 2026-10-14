package Inner_Classes;

class App {

    private String name;  // field

    public App() {
        name = "Elizabeth";
    }

    public void run() {   // method inside App
        class Printer {   // local inner class
            public void print() {
                System.out.println(App.this.name);  // access outer class field
            }
        }
         new Printer().print();// call print()
    }
}

public class Local_Inner_Classes {
    public static void main(String[] args) {
    new App().run();
    }
}
