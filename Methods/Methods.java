package Methods;

class Person {
    private String name ;
    private int age ;


    public String getName(){
        return name ;
    }
    public int getAge(){
        return age ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setAge(int age){
        this.age = age ;
    }

}
public class Methods {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("ram");
        p1.setAge(20);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
