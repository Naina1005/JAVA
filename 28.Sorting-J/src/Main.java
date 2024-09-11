//Problem statement : Sorting an array
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number of elements : ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int swap;

        //sorting an array in ascending order
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }

        System.out.println("Sorted array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}