//Problem statement : Calculating average of numbers entered by the user using functions
import java.util.*;
public class Main {
    //function to perform average
    static float average(int[] ar) {
        float sum = 0;
        float a;
        for(int i=0; i<(ar.length);i++)
        {
            sum = sum + ar[i];
        }
        a = sum/ar.length;
        return a;
    }

    //Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number of integers as input from user
        int n;
        System.out.print("Enter the number of integers : ");
        n = sc.nextInt();

        //Taking numbers (to calculate average) as input from user in form of an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        float avg;
        avg = average(arr);
        System.out.println(avg);
    }
}
