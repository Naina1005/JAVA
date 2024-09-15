//Problem statement : To print multiplication table of a number using methods
import java.util.*;
public class Main{
    static void mul(int x){
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" * "+i+" = "+x*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter an integer : ");
        n = sc.nextInt();
        System.out.println("Multiplication Table of "+n+" is : ");
        mul(n);

    }
}