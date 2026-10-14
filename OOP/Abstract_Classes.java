package OOP;

abstract class GameObject {
    public abstract void describe();
}

class Monster extends GameObject {
    @Override
    public void describe() {
        System.out.println("I am Monster...");
    }
}

class player extends GameObject {
    @Override
    public void describe() {
        System.out.println("I am a player...");
    }
}

public class Abstract_Classes {
    public static void main(String[] args) {

        Monster mons = new Monster();
        mons.describe();

        player plr = new player();
        plr.describe();

/*
        GameObject[] objs = {new Monster(), new player()}; // creating references of abstract class
        for (var obj : objs) {
            obj.describe();
        }

 */
    }
}
