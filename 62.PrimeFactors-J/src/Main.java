//Problem statement : Printing prime factors of a number

import java.util.*;
public class Main{
    static void pFactor(int num) {
        //Looking for prime numbers from 2 to num(1 is not a prime number)

        for(int i =2; i<=num; i++)
        {
            int count = 0;
            for(int j=1; j<=i; j++)
            {
                if(i%j == 0)
                {
                    count ++;
                }
            }
            if(count <=2)
            {
                if(num%i == 0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter a number :");
        n = sc.nextInt();
        System.out.println("Prime Factors of "+n+" are : ");
        pFactor(n);

    }
}