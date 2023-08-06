package class5Homework;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter quiz score: ");
        double quiz=scanner.nextDouble();
        System.out.print("please enter mid score: ");
        double mid=scanner.nextDouble();
        System.out.print("please enter final score: ");
        double fina=scanner.nextDouble();
        double average=(quiz+mid+fina)/3;

        if (average>=90){System.out.println("grade: A");}
        else if (average>=70 && average<90) {System.out.println("grade: B");}
        else if (average>=50 && average<70) {System.out.println("grade: C");}
        else if (average<50 ) {System.out.println("grade: F");}

        }
    }

