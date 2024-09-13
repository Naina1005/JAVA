//Problem statement : Factorial of a given number
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int fact = 1;
        System.out.println("enter a number : ");
        n = sc.nextInt();
        for(int i =n;i>=0;i--)
        {
            if(i == 0 || i==1)
            {
                fact = fact;
            }
            else
            {
                fact = fact*i;
            }
        }
        System.out.print("Factorial of given number is  :"+fact);
    }
}