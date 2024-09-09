//Problem statement :checking how various string methods works.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        int start, end;
        System.out.println("Enter a string with at least 12 characters");
        Scanner scan = new Scanner(System.in);


        String st = scan.next();//This will take only single word as input
        System.out.println(st);

        //method 1- length()
        System.out.println("The length iof the string is : "+st.length());

        //method 2- toLowerCase()
        System.out.println("Converting complete string to lowercase : "+st.toLowerCase());

        //method 3- toUpperCase()
        System.out.println("Converting complete string to uppercase : "+st.toUpperCase());

        //method 4- substring(start_index)
        System.out.println("Enter the start index :");
        start = scan.nextInt();
        System.out.println(st.substring(start)+" is s substring of entered string with start index "+start);

        //method 5- substring(start_index, end_index)
        System.out.println("Enter the end index :");
        end = scan.nextInt();
        System.out.println(st.substring(start,end)+" is also a substring od entered string with start index "+start+" and end index " +end );

        //method 6- replace('char1','char2')
        char c1, c2;
        System.out.println("enter a character that you want to replace : ");
        c1 = scan.next().charAt(0);
        System.out.println("enter the character with which you want to replace : ");
        c2 = scan.next().charAt(0);
        System.out.println("New string obtained after replacing "+c1+" with "+c2+"is : "+st.replace(c1,c2));

        //method 7- replace(str1, str2)
        String str1, str2;
        System.out.println("enter a substring from entered string that you want to replace :");
        str1 = scan.next();
        System.out.println("enter a string that you want to replace it with :");
        str2 = scan.next();
        System.out.println("after replacing the output string is : "+st.replace(str1,str2));

        //method 8-startsWith()
        String str3;
        System.out.println("Enter the string for which you want to check startsWith()");
        str3 = scan.next();
        System.out.println(st.startsWith(str3));

        //method 9- st.charAt(index)
        int index;
        System.out.println("enter an index to know which character is present at that index");
        index = scan.nextInt();
        System.out.println("The character present at index "+index+" is "+st.charAt(index));

    }
}