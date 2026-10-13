package Static;

class thing {
    public static int count = 0;

    public thing() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return count + " " + "Object created";
    }
}

public class Static_Method {
    public static void main(String[] args) {
        thing obj1 = new thing();
        thing obj2 = new thing();
        System.out.println(obj1);

        System.out.println(thing.getCount());
    }
}
