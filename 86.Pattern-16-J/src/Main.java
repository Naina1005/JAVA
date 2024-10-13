//Problem statement : to print following series
/*

0
1 1
2 3 5
8 13 21
....
*/


import java.util.*;

//Main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int n = sc.nextInt();
        int a =0;
        int b =1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(a+" ");
                int c = a+b;
                a = b;
                b = c;
            }
            System.out.print("\n");
        }
    }
}