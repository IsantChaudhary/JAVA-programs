package Static;

class Dog {

    public static int count = 0;
    private final int ID;
    private final String name;

    public Dog(String name) {
        this.name = name;
        ID = count;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String toString() {
        return String.format("Dog id : %d , ame : %s", ID, name);
    }
}

public class Assigning_IDs {
    public static void main(String[] args) {
        Animal obj1 = new Animal("Max");
        Animal obj2 = new Animal("Luna");
        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(Animal.getCount());
    }
}
