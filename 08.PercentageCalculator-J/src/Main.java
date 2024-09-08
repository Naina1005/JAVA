//Problem Statement : Finding percentage of a student in CBSE board
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1, m2, m3, m4, m5;
        System.out.println("Enter marks out of 100 for five subjects ");
        System.out.println("Enter marks in Physics : ");
        m1 = scan.nextInt();
        System.out.println("Enter marks in Chemistry : ");
        m2 = scan.nextInt();
        System.out.println("Enter marks in Maths : ");
        m3 = scan.nextInt();
        System.out.println("Enter marks in English : ");
        m4 = scan.nextInt();
        System.out.println("Enter marks in Hindi : ");
        m5 = scan.nextInt();
        float percentage;
        percentage = (m1+m2+m3+m4+m5)/5.0f;
        System.out.println("Percentage :"+percentage);

    }
}