//Problem statement : Printing Nth term of fibonacci series using recursion
import java.util.*;
public class Main{
    static int fib(int a){
        if(a==0)
        {
            return 0;
        }
        else if(a==1)
        {
            return 1;
        }
        else
        {
            return fib(a-1) + fib(a-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer :");
        n = sc.nextInt();
        int nth;
        nth = fib(n);
        System.out.println(nth);

    }
}