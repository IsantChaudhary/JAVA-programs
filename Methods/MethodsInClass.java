package Methods;

class person1{
    String name ;
    void sayHello(){
        System.out.println("My name is " + name);
    }
}
public class MethodsInClass {
    public static void main(String[] args) {

        person1 p2 = new person1();
        p2.name = "Jack";
        p2.sayHello();
    }
}
