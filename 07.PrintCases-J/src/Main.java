//Problem Statement : understanding various print statements

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        //case 1: println :
        System.out.println("Hello");
        System.out.println("Good morning");
        // separate lines will be used to print above statements.

        //case 2 : print :
        System.out.print("Hello");
        System.out.print("Good morning");
        System.out.println("\n"); // \n is used to move to a new line. If it is not used then next print statement will continue from same line.
        //No separate lines will be used.

        //case 3 : printf:
        String a ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        a = scan.nextLine();
        System.out.printf("Hi %s",a);

    }
}