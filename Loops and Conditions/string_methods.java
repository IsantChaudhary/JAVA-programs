package strings_and_conditionals;

public class string_methods {
    public static void main(String[] args) {
        String name = "Ishant";
        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String a = "    hello    ";
        System.out.println(a);
        System.out.println(a.trim());

        System.out.println(name.substring(0,6));
        System.out.println(name.replace('h','a'));

        System.out.println(name.startsWith("Ish"));
        System.out.println(name.endsWith("ant"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a',0));

        System.out.println("--------------------------------------");

        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a',2));

        System.out.println(name.equals("Ishant"));
        System.out.println(name.equalsIgnoreCase("ishant"));

        System.out.println("escape \\ sequence \n  characters");
        System.out.println("escape \t sequence \"  characters");

    }
}
