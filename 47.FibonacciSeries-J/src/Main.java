//Problem statement : Printing fibonacci series for an integer entered by a user
import java.util.*;
public class Main{
    static int fib(int x){
        if(x == 0)
        {
            return 0;
        }
        else if(x == 1)
        {
            return 1;
        }
        else{
            return fib(x-1) + fib(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter an integer : ");
        n = sc.nextInt();
        int f;
        f = fib(n);
        System.out.println("Fibonacci series till "+n+" is : ");
        for(int i= 0;i<=n;i++)
        {
            System.out.print(fib(i)+" ");
        }

    }
}