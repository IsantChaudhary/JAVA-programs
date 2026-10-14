package Inner_Classes;

class person {
    public void print() {
        Head head = new Head();
        Body body = new Body();

        head.print();
        body.print();
    }

    public static class Head {
        public void print() {
            System.out.println("Head...");
        }
    }

    public static class Body {
        public void print() {
            System.out.println("Body...");
        }
    }
}

public class Static_Inner_Classes {
    public static void main(String[] args) {

        person p1 = new person();
        p1.print();

        person.Head h1 = new person.Head();
        h1.print();
    }
}
