//Problem statement : To calculate average marks
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students : ");
        n = sc.nextInt();

        int [] marks = new int[n];
        System.out.println("Enetr the marks of students : ");
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }

        float sum = 0 ;

        //method 1 : Using for loop
        /*
        for(int i=0;i<n;i++)
        {
            sum = sum + marks[i];
        }
        */

        //method - 2 : Using for each loop
        for(int e : marks)
            sum = sum + e ;

        float avg = sum/n;
        System.out.println("Average of marks is : "+avg);
    }
}