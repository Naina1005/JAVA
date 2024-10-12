//Problem statement : To print the following pattern
/*

    *
   *
  *
 *
*

*/
import java.util.*;
//Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for n(It denotes number of rows to be printed) : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}