package class11Homework;
//Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphabets(abd AZ) characters are there in the String.

public class Hw3StringMethods {
    public static void main(String[] args) {
        String  str="jafjLKZNLnjdnf£#$430543jksndKLNG$½";
        System.out.println(str);
        String str1=str.replaceAll("[A-Z]","=");
        char [] arr=str1.toCharArray();
        int count=0;
        for (char upperCase:arr){
            if (upperCase=='='){
                count++;
            }

        }System.out.println("upperCase number of str: "+count);

        String str2=str.replaceAll("[a-z]","-");
        char [] arr1=str2.toCharArray();

        int count1=0;
        for (char upperCase:arr1){
            if (upperCase=='-'){
                count1++;
            }

        }System.out.println("lowerCase number of str: "+count1);

        System.out.println("total alphabet : "+(count+count1));




}}
