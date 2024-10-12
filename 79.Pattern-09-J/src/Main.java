//Problem statement : To print the following pattern

/*

*   *
 * *
  *
 * *
*   *

*/

import java.util.*;
//Main class
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int n = sc.nextInt();

        for(int i=0; i<=n-1; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j==(i+1) || j==(n-i))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}