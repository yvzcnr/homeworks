package class11Homework;
//How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever

public class Hw5StringMethods {
    public static void main(String[] args) {
        String  str="This is sentence i want to reverse";
        System.out.println(str);
        String [] arr=str.split(" ");


        System.out.println(".......................");

        for (int i=arr[0].length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[1].length()-1; i>=0;i--){
            System.out.print(arr[1].charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[2].length()-1; i>=0;i--){
            System.out.print(arr[2].charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[3].length()-1; i>=0;i--){
            System.out.print(arr[3].charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[4].length()-1; i>=0;i--){
            System.out.print(arr[4].charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[5].length()-1; i>=0;i--){
            System.out.print(arr[5].charAt(i));
        }
        System.out.print(" ");
        for (int i=arr[6].length()-1; i>=0;i--){
            System.out.print(arr[6].charAt(i));
        }

}}
