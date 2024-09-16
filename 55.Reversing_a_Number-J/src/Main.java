//Problem statement : Reversing a number :
import java.util.*;
public class Main{
    static void Reverse(int a )
    {
        int num = 0;
        while(a>0)
        {
            int temp = a%10;
            num = num*10 + temp;
            a = a/10;
        }
        System.out.println(num);

    }
    public static void main(String[] args) {
        int n1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n1 = sc.nextInt();
        Reverse(n1);
    }
}