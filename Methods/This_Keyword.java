package Methods;

public class This_Keyword {

    String name;
    int age;

    // Constructor
    public This_Keyword(String name, int age) {
        this.name = name; // Refers to the instance variable
        this.age = age;   // Refers to the instance variable
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        This_Keyword student1 = new This_Keyword("Hello", 21);

        student1.display();
    }
}