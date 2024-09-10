//Problem Statement : Detecting double and triple spaces in a string
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str;
        int a,b;
        str = scan.nextLine();
        a = str.indexOf("  ");
        if(a == -1){
            System.out.println("Double spaces not present ");
        }
        else{
            System.out.println("double spaces present ");
        }
        b = str.indexOf("   ");
        if(b == -1){
            System.out.println("Triple spaces not present ");
        }
        else{
            System.out.println("Triple spaces present ");
        }
    }
}