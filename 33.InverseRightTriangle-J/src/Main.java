/*Problem statement : printing the following pattern

****
***
**
*

*/

public class Main{
    public static void main(String[] args) {
        char c = '*';
        for(int i=4;i>0;i--)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}