//Problem Statement : Program to check whether a number is greater than user entered number or not
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 12;
        int n2;

        System.out.println("Enter a number: ");
        n2 = scan.nextInt();
        if(n2==n1){
            System.out.println("Both the numbers are equal");
        }
        else{
            if(n2>n1){
                System.out.println(n2+" is greater than "+n1);
            }
            else {
                System.out.println(n1+" is greater than "+n2);
            }
        }
    }
}