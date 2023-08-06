package class5Homework;

import java.util.Scanner;

public class CalculatedSwitch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter num1: ");
        int num1=scanner.nextInt();
        System.out.print("please enter num2: ");
        int num2=scanner.nextInt();
        System.out.print("please enter op: ");
        int op=scanner.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("result: "+(num1+num2));
                break;
            case '-':
                System.out.println("result: "+(num1-num2));
                break;
            case '*':
                System.out.println("result: "+(num1*num2));
                break;
            case '/':
                System.out.println("result: "+(num1/num2));
                break;

            default:
                System.out.println("NOT ACCEPTABLE");

        }
    }
}
