package Static;

class Obj {
    public static int count = 0 ;

    public Obj(){
        count++ ;
    }
    public String toString(){
        return count + " " + "Object created" ;
    }
}
public class Static_Variables {
    public static void main(String[] args) {

        Obj obj1 = new Obj();
        Obj obj2 = new Obj();
        System.out.println(obj1);
    }
}
