import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args) {

        for(int i=3; i>=1; i--)
        {

            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=6-i; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=1; i<=2; i++)
        {
           for(int j=1; j<=i; j++)
           {
               System.out.print(" ");
           }
           for(int j=i+1; j<=5-i; j++)
           {
               System.out.print("*");
           }
           System.out.print("\n");
        }

    }
}