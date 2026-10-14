package Overloading_Methods_and_Constructors;

class Man {

    private final String name;

    public Man(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Women extends Man {
    public Women(String name) {
        super(name);
    }
}

public class Super_Keyword {
    public static void main(String[] args) {

        Women w = new Women("sita");
        System.out.println(w);
    }
}
