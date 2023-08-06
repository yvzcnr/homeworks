package class5Homework;

import java.util.Scanner;

public class CurrentTimeAnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter current time: ");
        double currentTime=scanner.nextDouble();


        if (currentTime>=1 && currentTime<=11){System.out.println("morning");}
        else if (currentTime>=12 && currentTime<=15) {System.out.println("afternoon");}
        else if (currentTime>=16 && currentTime<=20) {System.out.println("evening");}
        else if (currentTime>=21 && currentTime<=24 ) {System.out.println("night");}

        }
    }

