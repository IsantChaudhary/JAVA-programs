package Methods;

class Human {
    private String name;
    private int age;

    public Human() {
        name = "?";
        age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name + " , Age : " + age;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.setName("Ram");
        human1.setAge(33);
        System.out.println(human1);

        Human human2 = new Human();
        System.out.println(human2);

        Human human3 = new Human("Shyam", 35);
        System.out.println(human3);

    }
}
