//CONTD...
//Problem Statement : String methods
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String st;
        System.out.println("Enter a string with or without spaces : ");
        st = scan.nextLine();

        //method 10- trim()
        System.out.println("String after removing leading and trailing whitespaces is : "+st.trim());

        //method 11- indexOf(character/string) //index of first occurrence
        System.out.println("Enter the string for which you want find the index : ");
        String str = scan.nextLine();
        System.out.println("index of "+str+" is " +st.indexOf(str));

        //method 12- indexOf(string , start index)
        System.out.println("Enter the start index: ");
        int start = scan.nextInt();
        System.out.println("index of "+str+" starting from "+start+" is " +st.indexOf(str,start));

        //method 13- lastIndexOf(character/string) //gives the index of last occurrence.It basically searches from last
        System.out.println("index of above string wrt last occurrence is "+st.lastIndexOf(str));

        //method 14- lastIndexOf(string, index)
        System.out.println("enter end index");
        int last = scan.nextInt();
        System.out.println("index of above string wrt last occurrence after index "+last+ " is "+st.lastIndexOf(str,last));

        //method 15- equals(string)
        System.out.println("Enter a string to match ");
        String str2 = scan.nextLine();
        System.out.println(st.equals(str2));

        //method 16- equalIgnoreCase(string)
        System.out.println(st.equalsIgnoreCase(str2));


    }
}