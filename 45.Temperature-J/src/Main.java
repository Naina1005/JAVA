//Problem statement : To convert temperature in degree celsius to Fahrenheit
import java.util.*;
public class Main{
    static float temp(float t)
    {
        float tempF;
        tempF = ((9/5.0f)*t) + 32;
        return tempF;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c;
        System.out.println("enter temperature in celsius : ");
        c = sc.nextFloat();
        float f;
        f = temp(c);
        System.out.println(f);
    }
}