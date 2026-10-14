package Enumerations;

enum Holidays {
    SATURDAY, SUNDAY
}

public class Enum_And_Switch {
    public static void main(String[] args) {

        Holidays h1 = Holidays.SATURDAY;
        Holidays h2 = Holidays.SUNDAY;
        System.out.println(h1);

        switch (h2) {

            case SATURDAY:
                System.out.println("Saturday is Holiday");
                break;

            case SUNDAY:
                System.out.println("Sunday is holiday");
                break;

            default:
                System.out.println("Invalid Holiday");
                break;
        }
    }
}
