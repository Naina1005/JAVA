//Problem statement : Conversion of Kms to Miles
public class Main{
    public static void main(String[] args) {
        int Km = 2000;
        float miles;
        //formula [1Km = 0.62137]
        miles = Km*0.62137f;
        System.out.println("Value of Km in miles is : "+miles);

    }
}