//Problem statement : reverse multiplication table
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for(int i = 10; i>=1 ; i--)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}