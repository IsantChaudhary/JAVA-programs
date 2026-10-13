package Static;

class cat {
    public static final String FOOD = "Cat food";
    private final String name;

    public cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name is " + name;
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {

        cat cat1 = new cat("Horace");
        System.out.println(cat1);
        System.out.println(cat.FOOD);

    }
}
