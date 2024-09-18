//Problem statement : To check if a number is armstrong number or not.

import java.util.*;
public class Main{
    static int length(int num){
        int temp;
        temp = num;
        int sum = 0;
        int rem;
        int count = 0;
        while(temp!=0)
        {
            rem = temp%10;
            count ++;
            temp = temp/10;
        }
        return count;

    }
    static boolean arm(int num , int c)
    {
        int temp;
        temp = num;
        int sum = 0;
        int rem;
        while(temp!=0)
        {
            rem = temp%10;
            temp = temp/10;
            sum = sum + (int)Math.pow(rem , c);
        }
        if(sum == num)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number :");
        n = sc.nextInt();

        //This function will give the number of digits in the number
        int count;
        count = length(n);

        //This function will tell whether a number is an armstrong number or not .
        boolean ans;
        ans = arm(n,count);
        if(ans)
        {
            System.out.println("The number is an Armstrong number.");
        }
        else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}