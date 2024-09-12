//Problem statement : printing first n odd numbers ;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of odd numbers : ");
        n = sc.nextInt();
        int j = 1;
        for(int i=0; i<n; i++)
        {
            System.out.println(j);
            j = j+2;
        }
    }
}