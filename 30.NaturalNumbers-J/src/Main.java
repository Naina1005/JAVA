//Problem statement : using do while loop to print first n natural numbers
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n ;
        n = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}