//Problem statement : To check if a number is an abundant number or not
//an abundant number is a positive integer for which the sum of its proper divisors is
// greater than the number

import java.util.*;
public class Main{
    static void abundant(int num)
    {
        int sum = 0;
        for(int i=1; i<num;i++)
        {
           if(num%i == 0)
           {
               sum = sum + i;
           }
        }
        if(sum > num)
        {
            System.out.println("Abundant number ");
        }
        else {
            System.out.println("Not an Abundant number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        abundant(n);
    }
}