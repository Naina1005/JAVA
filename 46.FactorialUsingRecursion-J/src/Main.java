//Problem statement : Calculating factorial using recursion
import java.util.*;
public class Main{
    static int fact(int x)
    {
        if(x==0 || x==1)
        {
            return 1;
        }
        else{
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number : ");
      n = sc.nextInt();
      int f;
      f = fact(n);
      System.out.println("Factorial of "+n+" is "+f);
    }
}