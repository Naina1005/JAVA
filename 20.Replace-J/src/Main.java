//Problem statement : Replacing spaces in a string with underscores
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //case 1 (replacing characters):
        System.out.println("Enter a string with spaces : ");
        String str = sc.nextLine();
        System.out.println("After replacement : "+str.replace(' ','_'));


        //case 2 (replacing strings) :
        System.out.println("enter your name  :");
        String name = sc.nextLine();
        String a = "Dear <|name|> thanks a lot.";
        System.out.println(a);
        System.out.println("after replacing <|name|> with string entered : "+a.replace("<|name|>",name));


    }
}