//Problem statement : Program to find sum of three numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a , b, c, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a + b+ c;

        System.out.println("Sum of the numbers is : "+sum);

    }
}