//Problem statement : to check if numbers entered by user is an friendly pair or not
//friendly Pair : A friendly pair is a pair of numbers that have the same abundancy index
//which is the ratio of a number's sum of divisors to the number itself.

import java.util.*;
public class Main{
    static float abundantInd(int num)
    {
        float abIndex;
        float sum = 0;
        for(int i=1; i<num; i++)
        {
            if(num%i == 0)
            {
                sum = sum + i;
            }
        }
        abIndex = num/sum;
        return abIndex;
    }
    static void friendlyPair(float a, float b)
    {
        if(a==b)
        {
            System.out.println("Friendly Pair");
        }
        else
        {
            System.out.println("Not a Friendly Pair");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter a number :");
        n1 = sc.nextInt();
        System.out.println("enter another number :");
        n2 = sc.nextInt();
        float ind1 = abundantInd(n1);
        float ind2 = abundantInd(n2);
        friendlyPair(ind1,ind2);
    }
}