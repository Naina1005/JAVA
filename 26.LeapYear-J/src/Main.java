//Problem statement - to check whether a year is leap year or not
//if any year is divisible by 4 then it is a leap year but if it is divisible by 100 then it is not a leap year.but if any centurial year is divisible by 400 then it is a leap year
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("Enter a year : ");
        y = sc.nextInt();
        if(y%4==0 && y%100!=0 || y%400==0)
        {
            System.out.println("Entered year is a leap year.");
        }
        else{
            System.out.println("Not a leap year.");
        }
    }
}