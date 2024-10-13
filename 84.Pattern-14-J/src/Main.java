//Problem statement : to print thefollowing pattern
/*
empty hourglass

*******
 *   *
  * *
   *
  ***
 *****
*******

*/

//Main class
public class Main{
    public static void main(String[] args){
        int n =7;
        int mid = (n+1)/2;

        //Printing the first half of the hourglass
        for(int i=n; i>=mid; i--)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==n || i==j || i+j== n+1)
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

        //Printing the second half of the hourglass
        for(int i=mid-1; i>=1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=(n+1-i); j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}