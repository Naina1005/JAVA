//Problem statement : Finding power of a given number
import java.util.*;
public class Main{
    static double Power(double num, double pow)
    {

        double ans = Math.pow(num,pow);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p ;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        System.out.println("Enter the power to which number has to be raised : ");
        p = sc.nextInt();
        double a;
        a = Power(n,p);
        System.out.println(a);
    }
}