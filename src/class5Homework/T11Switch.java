package class5Homework;

import java.util.Scanner;

public class T11Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a grade");
        char gender=scanner.next().charAt(0);

        switch (gender){
            case 'A':
                System.out.println("EXCELLENT");
                break;
            case 'B':
                System.out.println("GOOD");
                break;
            case 'C':
                System.out.println("AVERAGE");
                break;
            case 'D':
                System.out.println("BAD");
                break;

            default:
                System.out.println("NOT ACCEPTABLE");

        }
    }
}
