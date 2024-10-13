//Problem statement : to print the following series
/*
1
2 3
4 5 6
7 8 9 10
...
*/

import java.util.*;

//Main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("enter number of rows : ");
        n = sc.nextInt();

        int val = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(val+" ");
                val++;
            }
            System.out.print("\n");
        }

    }
}