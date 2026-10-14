package Inner_Classes;

class Fox {

    String name;

    public Fox() {
        System.out.println(this);
        this.name = "StephenWolf";
    }
}

public class HashCode_And_This {
    public static void main(String[] args) {

        Fox fox = new Fox();
        System.out.println(fox);

        System.out.printf("%x\n", fox.hashCode());

        Fox fox1 = fox;
        System.out.println(fox1);

        System.out.println(fox.name);
    }
}
