//Problem statement : To check if a number is Palindrome or not
/*Palindrome number : if a number remains same on reversing its digits then it is called a Palindrome
for Example 12321 is a palindrome number while 12345 is not.*/

import java.util.*;
public class Main{
    static boolean Palindrome(int p)
    {

       int rev = 0;
       int temp = p;
       while(temp!=0)
       {
           int rem  = temp%10;
           rev = (rev*10) + rem;
           temp = temp/10;
       }
       if(rev == p)
       {
           return true;
       }
       else{
           return false;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean ans;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        ans = Palindrome(n);
        if(ans)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

