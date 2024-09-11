//Problem statement : Rock paper Scissors
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //Taking input from user
        String inp;
        System.out.println("Enter your choice : \nR for Rock\nP for Paper\nS for Scissors: ");
        inp = sc.next();

        //Generating random character
        String [] arr = {"rock" , "paper" , "scissors"};
        String cmove = arr[r.nextInt(arr.length)];
        System.out.println("Computer's move : "+cmove);

        //Winner declaration
        if(cmove.equals("rock"))
        {
            if(inp.equals("R"))
            {
                System.out.println("Match draw : Same input ");
            }
            else if(inp.equals("S"))
            {
                System.out.println("Computer won \nBetter luck next time.");
            }
            else if(inp.equals("P")){
                System.out.println("You won\nCongratulations!");
            }

        }


        if(cmove.equals("paper"))
        {
            if(inp.equals("P"))
            {
                System.out.println("Match draw : Same input ");
            }
            else if(inp.equals("S"))
            {
                System.out.println("Computer won \nBetter luck next time.");
            }
            else if(inp.equals("R")){
                System.out.println("You won\nCongratulations!");
            }

        }


        if(cmove.equals("scissors"))
        {
            if(inp.equals("S"))
            {
                System.out.println("Match draw : Same input ");
            }
            else if(inp.equals("P"))
            {
                System.out.println("Computer won \nBetter luck next time.");
            }
            else if(inp.equals("R")){
                System.out.println("You won\nCongratulations!");
            }

        }
    }
}