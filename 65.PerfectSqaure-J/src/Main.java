//Problem statement : To check if a number is perfect square or not
import java.util.*;
public class Main{
    static void perfSq(int num)
    {
        int a = (int)Math.sqrt(num);
        if(a*a == num)
        {
            System.out.println("Perfect square");
        }
        else {
            System.out.println("Not a Perfect Square ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        perfSq(n);
    }
}