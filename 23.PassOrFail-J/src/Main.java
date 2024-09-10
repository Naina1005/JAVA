//Problem statement : Program to find whether a student is pass or fail.
//conditions : Total percentage required = 40% and 33% in each subject

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter marks in Physics : ");
        m1 = sc.nextInt();
        System.out.println("Enter marks in Chemistry : ");
        m2 = sc.nextInt();
        System.out.println("Enter marks in Maths : ");
        m3 = sc.nextInt();
        float p = (m1+m2+m3)/3.0f;
        if(m1>=33 && m2>=33 && m3>=33 && p>= 40)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}