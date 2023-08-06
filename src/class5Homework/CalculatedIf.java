package class5Homework;

import java.util.Scanner;

public class CalculatedIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter num1: ");
        int num1=scanner.nextInt();
        System.out.print("please enter num2: ");
        int num2=scanner.nextInt();
        System.out.print("please enter op: ");
        int op=scanner.next().charAt(0);

        if (op == '+') {
            System.out.println("result: " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("result: " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("result: " + (num1 * num2));
        } else if (op == '/') {
            System.out.println("result: " + (num1 / num2));
        } else {
            System.out.println("NOT ACCEPTABLE");
        }
    }
}
