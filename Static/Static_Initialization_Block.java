package Static;

class Animal {

    public static int count;

    static {
        count = 0;
    }

    private final int ID;
    private final String name;

    public Animal(String name) {
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

public class Static_Initialization_Block {
    public static void main(String[] args) {

        Animal obj1 = new Animal("Max");
        Animal obj2 = new Animal("Luna");
        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(Animal.getCount());

    }
}
