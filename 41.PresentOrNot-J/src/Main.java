//Problem statement : To check whether an element is present is an array or not
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number of elements as input from user
        int n;
        System.out.println("Enter the number of elements  :");
        n = sc.nextInt();

        //declaring and initializing an array of int type
        int[] ele = new int[n];

        //Taking elements of array as input from the user
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println("At index "+i);
            ele[i] = sc.nextInt();
        }
         //Taking input from user
        int m;
        System.out.println("Enter an element to check : ");
        m=sc.nextInt();

        //logic
        int flag = 0;
        int index = 0;
        for(int i=0;i<n;i++)
        {
            if(m==ele[i])
            {
                flag = 1;
                index = i;
                break;
            }
            else {
                flag = 0;
            }

        }
        if(flag == 1)
        {
            System.out.println("Element is present at index : "+ index);
        }
        else{
            System.out.println("Element is not present.");
        }
    }
}