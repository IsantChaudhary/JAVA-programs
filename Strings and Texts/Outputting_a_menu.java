package Strings_and_Texts;

public class Outputting_a_menu {
    public static void main(String[] args) {

        String prompt = "Select an option:";
        String option1 = "Add an entry";
        String option2 = "View the database";
        String option3 = "Exit";

        int value1 = 1 ;
        int value2 = 2 ;
        int value3 = 3 ;

        String menu = "\t" + prompt + "\n" ;

        menu += "\t\t" + value1 + "."+ option1 + "\n";
        menu += "\t\t" + value2 + "."+ option2 + "\n";
        menu += "\t\t" + value3 + "."+ option3 + "\n";

        System.out.println(menu);

    }
}
