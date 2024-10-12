//Problem statement : To print the following pattern
/*

  *
 * *
*   *
 * *
  *

splitting the problem in two parts
vertical upper half and vertical lower half

vertical upper half for n=5(It includes the row with maximum spaces) :
  *
 * *
*   *

lower vertical half for n=5(It does not -includes the row with maximum spaces :
 * *
  *
*/
import java.util.*;
//Main class
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        int mid = (n+1)/2;

        //printing pattern of upper vertical half
        for(int i=mid; i>=1; i--)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==j || j==(n+1-i))
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

        //printing lower vertical half pattern
        for(int i=2; i<=mid; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==j || j==(n+1-i))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }
}