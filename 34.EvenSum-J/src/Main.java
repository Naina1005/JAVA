//Problem statement : Sum of first n even numbers
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= n)
        {
           sum = sum + i;
           i++;
        }
        System.out.println(sum);
    }
}