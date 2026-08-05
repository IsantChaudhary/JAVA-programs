package Methods;

class Menu{
    String [] menu = {"View Items" , "Add items" , "Delete an item" , "Quit the program"};

    void display(){
        System.out.println("Choose Your Option : ");
        for(int i=0; i< menu.length; i++){
            System.out.println("\t" + (i+1) + "." + menu[i]);
        }
    }
}
public class MenuExample {
    public static void main(String[] args) {

        Menu m1 = new Menu();
        m1.display();
    }
}
