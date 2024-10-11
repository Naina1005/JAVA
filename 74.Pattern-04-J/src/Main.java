//Problem statement : To print the following pattern
/*

*****
 ****
  ***
   **
    *

*/

//Main class
public class Main{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=5-i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}