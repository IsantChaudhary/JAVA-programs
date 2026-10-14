package Inner_Classes;

class person1 {
    private final String name;

    public person1(String name) {
        this.name = name;
    }

    public void display() {
        printer p = new printer();
        p.print();
    }

    public class printer {
        public void print() {
            System.out.println(name);
        }
    }

}

public class Non_Static_Inner_Classes {
    public static void main(String[] args) {

        person1 p1 = new person1("Selena");
        p1.display();

        person1.printer p = p1.new printer();
        p.print();
    }
}
