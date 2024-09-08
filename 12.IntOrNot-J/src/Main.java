//Problem Statement : To check if entered input by user in integer or not
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean a;
        System.out.println("Enter an integer : ");
        a = scan.hasNextInt();
        if(a)
        {
            System.out.println("input entered is integer");
        }
        else
        {
            System.out.println("Not an integer");
        }
    }
}