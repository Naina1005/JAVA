//Problem Statement : Writing various expressions in java
public class Main{
    public static void main(String[] args) {
        //Expression 1
        //(x-y)/2
        int x =3;
        int y = 4;
        System.out.println((x-y)/2.0f);

        //Expression 2
        //((b*b)-(4*a*c))/(2*a)
        int a =1;
        int b =2;
        int c =0;
        System.out.println(((b*b)-(4.0f*a*c))/(2.0f*a));

        //Expression 3
        //(v*v) - (u*u)
        int v =  2;
        int u = 1;
        System.out.println((v*v) - (u*u));

        //Expression 4
        //(m*n)-d
        int m = 7;
        int n = 2;
        int d =9;
        System.out.println((m*n)-d);

        //Expression 5
        float p = 7/4*9/2;
        System.out.println(p);

        //Expression 6
        float q = 7/4.0f * 9/2.0f;
        System.out.println(q);

    }
}