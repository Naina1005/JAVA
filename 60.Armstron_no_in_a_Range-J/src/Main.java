//Problem statement : To print the armstrong numbers in a given range

import java.util.*;
public class Main{
    static int count(int n)
    {
        int temp;
        temp = n;
        int cou = 0;
        int rem;
        while(temp!=0)
        {
            rem = temp%10;
            cou ++;
            temp = temp/10;
        }
        return cou;
    }
    static boolean arm(int num , int cou)
    {
        int temp;
        temp = num;
        int sum = 0;
        int rem;
        while(temp!=0) {
            rem = temp % 10;
            temp = temp / 10;
            sum = sum + (int) Math.pow(rem, cou);

        }
        if(sum == num)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower, upper;
        System.out.println("Enter the lower limit of the range : ");
        lower = sc.nextInt();
        System.out.println("Enter the upper limit of the range : ");
        upper = sc.nextInt();
        int c;
        //Getting the number of digits of each number in range.
        for (int i = lower; i <= upper; i++) {
            c = count(i);
            //Printing the armstrong numbers.
            if (arm(i, c)) {
                System.out.println(i);
            }
        }
    }
}