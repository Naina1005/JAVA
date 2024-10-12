//Problem statement : Printing the following pattern
/*

*** ***
**   **
*     *
**   **
*** ***

*/
import java.sql.SQLOutput;
import java.util.*;

//First vertical half for n=3(It includes the row with maximum spaces)
/*

*** ***
**   **
*     *

*/

//Second vertical half for n=3(It does not -includes the row maximum spaces)
/*

**   **
*** ***

*/
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Here n denotes the maximum columns in first half
        // of the diamond
        int n;
        System.out.println("Enter a number which is" +
                " greater than or equal to 3 : ");
        n = sc.nextInt();

        //outer loop for printing first vertical half of the pattern
        //which includes the line with maximum spaces
        for(int i=n; i>=1; i--)
        {

            //loop for printing left pattern of first vertical half
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            //Loop for printing the spaces in first vertical half
            for(int j=i+1; j<=((2*n)+1)-i; j++)
            {

                System.out.print(" ");
            }

            //Loop for printing the right pattern of first vertical half
            for(int j=(n+1)-i; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //outer loop for printing lower vertical pattern
        for(int i=2; i<=n; i++)
        {
            //loop for printing left pattern of second vertical half
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            //loop for printing spaces in second vertical half
            for(int j=i+1; j<=((2*n)+1)-i; j++)
            {
                System.out.print(" ");
            }

            //loop for printing right pattern of second vertical half
            for(int j=((2*n)+1)-i+1 ;j<=((2*n)+1); j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}