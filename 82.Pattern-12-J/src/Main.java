//Problem statement : To print the following statement(W)

/*

*   *
*   *
* * *
** **
*   *

*/

//Main class
public class Main{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(((j==i || j==6-i) && i!=2)||j==1||j==5)
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