//Problem statement : to find out the type of website
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        String web;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a website : ");
        web = sc.next();
        if(web.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(web.endsWith(".org"))
        {
            System.out.println("Organizational Website");
        }
        else if(web.endsWith(".in"))
        {
            System.out.println("Indian website");
        }
        else{
            System.out.println("Wrong input");
        }
    }
}