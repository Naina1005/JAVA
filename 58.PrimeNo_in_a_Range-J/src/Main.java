//Problem statement : to find number of Prime Number in a range
import java.util.*;
public class Main{
    static void Prime(int p1) {
        if(p1==0 || p1 == 1)
        {
            System.out.println(p1+" is not prime.");
        }
        else {
            int count = 0;
            for(int i=2;i<=p1;i++)
            {
                if(p1%i==0)
                {
                    count ++;
                }
            }
            if(count < 2)
            {
                System.out.println(p1+" is Prime");
            }
            else {
                System.out.println(p1+" is not Prime");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter the lower limit of the range : ");
        n1 = sc.nextInt();
        System.out.println("Enter the upper limit of the range : ");
        n2 =sc.nextInt();
        if(n1>n2)
        {
            System.out.println("Range is not correct. ");
        }
        else {
            for(int i=n1; i<=n2; i++)
            {
                Prime(i);
            }
        }

    }
}