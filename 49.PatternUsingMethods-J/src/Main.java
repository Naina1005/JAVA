//Problem statement : To print following patterns using methods
/*
pattern -1
*
* *
* * *
* * * *

Pattern -2
* * * *
* * *
* *
*

*/

public class Main{
    static void pattern()
    {
        for(int i=1; i<=4;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    static void invPattern()
    {
        for(int i=4; i>=1;i--)
        {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        pattern();
        System.out.println("\n");
        invPattern();
    }

}