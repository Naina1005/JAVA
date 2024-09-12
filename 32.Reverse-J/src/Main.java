//Problem statement : printing n natural numbers in reverse order
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number : ");
        n = sc.nextInt();
        for(int i=n; i>0; i--)
        {
            System.out.println(i);
        }
    }
}