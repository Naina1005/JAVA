//Problem statement : Calculating tax to paid
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sal;
        float tax = 0;
        System.out.println("enter salary in lpa : ");
        sal = sc.nextInt();
        if(sal<=2.5)
        {
            tax = tax + 0;
        }
        else if(sal>2.5 && sal<=5)
        {
            tax = tax + (sal*5)/100.0f;
        }
        else if(sal>5 && sal<=10)
        {
            tax = tax + (sal*20)/100.0f;
        }
        else{
            tax = tax + (sal*30)/100.0f;
        }
        System.out.println("Tax to be paid is : "+tax*100000);
    }
}