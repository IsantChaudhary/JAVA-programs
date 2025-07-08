package Using_Variables;

public class Converting_Tempratures {
    public static void main(String[] args) {

        double fahrenheit = 98.6;
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius");
    }
}
