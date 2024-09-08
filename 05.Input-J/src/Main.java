//Taking input from user using Scanner Class - ONLY FOR PRIMITIVE DATATYPES
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        //Scanner definition
        Scanner scan = new Scanner(System.in);
        int a;
        long b;
        byte c;
        short d;
        float e;
        double f;
        char g;
        boolean h;

        //Taking inputs from the user
        //int-
        System.out.println("Enter int datatype : ");
        a = scan.nextInt();

        //long-
        System.out.println("Enter long datatype : ");
        b = scan.nextLong();

        //byte-
        System.out.println("Enter byte datatype : ");
        c = scan.nextByte();

        //short-
        System.out.println("Enter short datatype : ");
        d = scan.nextShort();

        //float-
        System.out.println("Enter float datatype : ");
        e = scan.nextFloat();

        //double-
        System.out.println("Enter double datatype : ");
        f = scan.nextDouble();

        //char-
        System.out.println("Enter char datatype : ");
        g = scan.next().charAt(1);

        //boolean-
        System.out.println("Enter boolean datatype(in form of true or false) : ");
        h = scan.nextBoolean();

        //Printing outputs
        System.out.println("int = "+a);
        System.out.println("long = "+b);
        System.out.println("byte = "+c);
        System.out.println("short = "+d);
        System.out.println("float = "+e);
        System.out.println("double = "+f);
        System.out.println("char = "+g);
        System.out.println("boolean = "+h);




    }
}