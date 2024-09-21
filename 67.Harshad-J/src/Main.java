//problem statement : To check if a number is harshad number or not
//Harshad number is a number which is completely divisible by sum of its digits.

import java.util.*;
public class Main{
    static void harshad(int num)
    {
        int temp;
        temp = num;
        int sum = 0;
        int rem;
        while(temp!=0)
        {
            rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
        }
        if(num%sum==0)
        {
            System.out.println("Harshad number ");
        }
        else
        {
            System.out.println("Not a Harshad number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        harshad(n);
    }
}