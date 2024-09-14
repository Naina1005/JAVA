//Problem statement : find maximum element in an array
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter the no of elements : ");
        n = sc.nextInt();

        int [] arr = new int[n];
        System.out.println("enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Logic to find the maximum element:
        int max = arr[0];
        int flag = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]> max)
            {
                max =arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }
}