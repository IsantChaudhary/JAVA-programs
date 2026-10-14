package OOP;

interface Describable {
    String getDescription();
}

class person implements Describable {
    @Override
    public String getDescription() {
        return "I am a person";
    }
}

class computer implements Describable {
    @Override
    public String getDescription() {
        return "I am a Computer";
    }
}

public class Interfaces {
    public static void main(String[] args) {
/*
        person Jack = new person();
        System.out.println(Jack.getDescription());

        computer lenovo = new computer();
        System.out.println(lenovo.getDescription());

 */
        Describable[] objs = {new person(), new computer()}; // creating references of interface

        for (var obj : objs) {
            System.out.println(obj.getDescription());
        }
    }
}
