//Problem statement : To check if a number is an automorphic number or not
// an automorphic number is a natural number which when squared, ends with the same digits as the original number

import java.util.*;
public class Main{
    static boolean automorphic(int num)
    {
        int sq = (int)Math.pow(num,2);
        while(num !=0)
        {
            if(num%10 != sq%10)
            {
                return false;
            }
            num = num/10;
            sq = sq/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        boolean ans;
        ans = automorphic(n);
        if(ans)
        {
            System.out.println("automorphic number.");
        }
        else {
            System.out.println("Not an automorhic number ");
        }
    }
}