//Problem statement : to check if a number is strong number or not
/* Strong number is a special number whose sum of the factorial of digits is equal to the original number*/

import java.util.*;
public class Main{
    static int fact(int num){
        if(num == 0|| num==1)
        {
            return 1;
        }
        else{
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        //finding factorial of each digit in the number entered by the user
        int temp;
        temp = n;
        int sum = 0;
        int rem;
        int a ;
        while(n!=0)
        {
           rem = n%10;
           a = fact(rem);
           sum = sum + a;
           n = n/10;
        }
        if(sum == temp)
        {
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}