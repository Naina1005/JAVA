//Problem statement : Printing factors of a number entered by user

import java.util.*;
public class Main{
    static void factors(int num)
    {
        for(int i=1; i<=num; i++)
        {
            if(num%i == 0)
            {
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number : ");
        n = sc.nextInt();
        System.out.println("The Factors of "+n+" are : ");
        factors(n);
    }
}