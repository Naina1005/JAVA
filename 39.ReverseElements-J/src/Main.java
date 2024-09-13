//Problem statement : Printing elements of array in reverse order
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of items : ");
        n = sc.nextInt();
        int[] price = new int[n];

        //Getting input from the user :
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the input at index "+i);
            price[i] = sc.nextInt();
        }
        //Displaying output:
        System.out.println("Array :");
        for(int i=0;i<n;i++)
        {
            System.out.print(price[i]+" ");
        }
        System.out.println("\n");

        //Displaying elements of array in reverse order :
        System.out.println("Array in Reverse :");
        for(int j=(n-1);j>=0;j--)
        {
            System.out.print(price[j]+" ");
        }

    }
}

