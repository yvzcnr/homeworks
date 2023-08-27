package class11Homework;
//How would you swap  2 strings without a temporary variable?

public class Hw7StringMethods {
    public static void main(String[] args) {
        String name="yavuz";
        String surname="cinar";
        System.out.println("name :"+name);
        System.out.println("surname :"+surname);
        System.out.println("**");
        System.out.print("surname :");
        for(int i =0; i<name.length();i++)
        {System.out.print(name.charAt(i));}
        System.out.println();
        System.out.print("name :");
        for(int i =0; i<surname.length();i++)
        {System.out.print(surname.charAt(i));}

    }
}


