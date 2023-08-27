package class11Homework;

import java.util.Scanner;

//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
public class Hw1StringMethods {
    public static void main(String[] args) {
        String motherName="mary";
        String fatherName="daniel";
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter your gender boy or girl: ");
        String gender=scanner.nextLine();


        if (gender.equalsIgnoreCase("boy")){
            String boyName=fatherName.substring(0,3).concat(motherName.substring(2,4));
            System.out.println("boyName is "+boyName);
        } else if (gender.equalsIgnoreCase("girl")) {
            String girlName=motherName.substring(0,2).concat(fatherName.substring(3,6));
            System.out.println("girlName is "+girlName);
        }


}}
