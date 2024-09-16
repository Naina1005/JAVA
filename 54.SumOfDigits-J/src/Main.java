//Problem statement : Sum of digits
import java.util.*;
public class Main{
    static void SumOfDigits(int a)
    {
        int sum = 0;
        while(a>0)
        {
            int digit = a%10;
            sum = sum + digit;
            a = a/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Enter a number : ");
        n1 = sc.nextInt();
        SumOfDigits(n1);
    }
}