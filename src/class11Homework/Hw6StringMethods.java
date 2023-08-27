package class11Homework;
//How would you check if String is palindrome or not?
// aba=> true
//Abbc =>false

public class Hw6StringMethods {
    public static void main(String[] args) {
        String  str="level";
        System.out.println(str);
        String ch="";

            for (int i=str.length()-1;i>=0;i--){
            ch=ch+str.charAt(i);
                }
            if (ch.equals(str)){

                System.out.println("ıt is palindrome");
            }
           else {
                System.out.println("it is not palindrome");}







}}
