//Problem statement : Addition of two matrices
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking number of rows and columns as input from the user :
        int n,m;
        System.out.println("Enter the size of the matrices. Both matrices will have same number of rows and columns.");
        System.out.print("Rows : ");
        n = sc.nextInt();
        System.out.print("Columns : ");
        m = sc.nextInt();

        //taking values as input from the user
        int [][] mat1 = new int[n][m];
        int [][] mat2 = new int[n][m];
        //Matrix 1 :
        System.out.println("Enter the elements of matrix1 : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter element at index : ("+i+","+j+") : " );
                mat1[i][j] = sc.nextInt();
                System.out.print("\n");
            }
        }
        //Matrix - 2:
        System.out.println("Enter the elements of matrix2 : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter element at index : ("+i+","+j+") : " );
                mat2[i][j] = sc.nextInt();
                System.out.print("\n");
            }
        }

        //Displaying matrices :
        //Matrix 1
        System.out.println("\nMatrix 1");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.print("\n");
        }


        //matrix 2
        System.out.println("\nMatrix 2 : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.print("\n");
        }

        //Performing addition operation on array elements :
        int [][]mat3 = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat3[i][j] = mat1[i][j]+ mat2[i][j];
            }
        }
        
        //addition of matrix 1 and matrix 2
        System.out.println("\nAddition of matrix 1 nad matrix 2 : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}