//Problem statement : Sum of numbers occurring in multiplication table of n
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum = sum+(n*i);
        }
        System.out.println("Sum of multiplication table of "+n+" is : "+sum);
    }
}