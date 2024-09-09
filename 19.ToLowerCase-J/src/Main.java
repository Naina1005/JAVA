// Problem statement : Converting a string to lowercase
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string : ");
        str = sc.nextLine();
        System.out.println("Lowercase : "+str.toLowerCase());
    }
}