//Problem statement : To calculate gpa from marks entered by the user
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int m1, m2, m3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 ");
        System.out.println("Enter the marks in Physics: ");
        m1 = scan.nextInt();
        System.out.println("Enter the marks in Chemistry: ");
        m2 = scan.nextInt();
        System.out.println("Enter the marks in Mathematics: ");
        m3 = scan.nextInt();
        //Formula for gpa = (percentage/100)*4;(gpa is calculated out of 4)
        float p = (m1+m2+m3)/3.0f;
        float gpa = (p/100)*4;
        System.out.println("Your GPA out of 4 is :"+ gpa);


    }
}