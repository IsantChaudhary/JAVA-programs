package Methods;

class person {
    String name;
    int age;
}

public class Class_Object {
    public static void main(String[] args) {

        person person1 = new person();
        person1.name = "Hello";
        person1.age = 25;

        System.out.println(person1.name);
        System.out.println(person1.age);
    }
}
