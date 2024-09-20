//Problem statement : to check if a number is perfect number
/* a perfect number is a positive integer that is equal to the sum of its positive proper divisors.
 Proper divisors of a number are the divisors other than the number itself */

import java.util.*;
public class Main{
    static int factors(int num)
    {
        int a;
        int sum = 0;
        for(int i=1;i<num;i++)
        {
            if(num%i == 0)
            {
                a = i;
                sum = sum + a;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        int divSum;
        divSum = factors(n);
        if(divSum == n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}