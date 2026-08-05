package Methods;

class Calculator {

    int square(int value) {
        System.out.println("Received the Value : " + value);
        return value * value;
    }

    int Addition(int a, int b) {
        System.out.printf("Adding %d and %d\n", a, b);
        return a + b;
    }
}

public class MethodParameters {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.square(5);
        System.out.println("The square is " + result);

        Calculator addition = new Calculator();
        int result1 = addition.Addition(5, 6);
        System.out.println("The Addition is " + result1);
    }
}
