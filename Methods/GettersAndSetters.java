package Methods;

class Info {
    private String name;
    private int age;

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
}

public class GettersAndSetters {
    public static void main(String[] args) {

        Info info = new Info();
        info.setName("Ram");
        info.setAge(33);

        System.out.println(info.getName());
        System.out.println(info.getAge());
    }
}
