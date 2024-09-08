//Problem Statement : Encrypting a grade by adding 8 to it and later decrypting it and displaying the correct answer
public class Main{
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println("encrpytd grade : " + grade);
        grade = (char)(grade-8);
        System.out.println("decrypted grade : " + grade);
    }
}