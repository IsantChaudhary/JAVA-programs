package Methods;

class returnsValues{
    String getAnimal(){
        System.out.println("returning an animal");
        return "Cat";
    }
}

public class ReturnValues {
    public static void main(String[] args) {

        returnsValues r1 = new returnsValues();
        String animal = r1.getAnimal();
        System.out.println(animal);
    }
}
