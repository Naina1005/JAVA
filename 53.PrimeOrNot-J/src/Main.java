//Problem statement : To check if a number is Prime or not.
import java.util.*;
public class Main{
    static void prime(int p)
    {
        int count = 0;

        //checking the number od divisors between 1 and n :
        if(p >= 2)
        {
            for(int i=1; i<=p; i++)
            {
                if(p%i == 0)
                {
                    count ++;
                }
            }
        }

        if(count > 2)
        {
            System.out.println("Not a prime number.");
        }
        else {
            System.out.println("Prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        prime(n);


    }
}