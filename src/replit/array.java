package replit;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []numbers=new int [5];
        for (int i = 1; i < numbers.length+1; i++) {
            numbers [i]= scanner.nextInt();
            System.out.println(i+" "+ numbers[i]+"0");
        }


    }
}

