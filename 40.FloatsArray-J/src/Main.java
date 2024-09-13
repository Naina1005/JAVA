//Problem statement : Calculating sum of elements in a float array
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements : ");
        n=sc.nextInt();
        float sum = 0;
        float[] Ele = new float[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the element at index : "+i);
            Ele[i] = sc.nextFloat();
        }
        for(int i=0;i<n;i++)
        {
            sum = sum+Ele[i];
        }
        System.out.println("The of the elements is  :"+sum);
    }
}