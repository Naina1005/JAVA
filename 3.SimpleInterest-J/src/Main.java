//This is a simple program to calculate Simple Interest
public class Main{
    public static void main(String[] args){
        //Formula for simple interest : SI = (P * R * T)/100
        //Here, P is Principal amount, R is the Rate of interest which is in % and T is the Time period in years
        int P = 5000;
        float R = 0.1F; //10% = 0.1
        float T = 1F;
        float SI = (P*R*T)/100;
        System.out.println("Simple Interest = "+SI);
        System.out.println("Total Amount = " +SI+P);
    }
}