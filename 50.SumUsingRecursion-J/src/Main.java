//Problem statement : calculating sum of first n natural numbers using recursion
import java.util.*;
public class Main{
    static int add(int a){
        if(a==0)
        {
            return 0;
        }
        else if(a==1){
            return 1;
        }
        else return a + add(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n;
        n = sc.nextInt();
        int sum;
        sum = add(n);
        System.out.println(sum);
    }
}