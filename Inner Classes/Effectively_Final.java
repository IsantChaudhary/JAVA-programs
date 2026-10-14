package Inner_Classes;

class Apps {
    public void runs() {
        String name = "Olsen";
        // name = "Hello"; --> If you want to use a local variable inside
        // an inner class or lambda, don’t change it after assigning once.
        class printers {
            public void prints() {
                System.out.println(name);
            }
        }
        new printers().prints();
    }
}

public class Effectively_Final {
    public static void main(String[] args) {
        new Apps().runs();
    }
}
