import java.util.Scanner;

public class ProductDivide {

    public static void main(String[] args) {
 int a, b,c,e;
        double d,f;
        Scanner scn = new Scanner(System.in);
        System.out.println("eNTER FIRST NUMBER");
        a = scn.nextInt();
        System.out.println("ENTER Second NUMBER");
        b = scn.nextInt();
    
        c = a*b;
        d= (double)a/b;
        f=d*0;
        e = (int)d;
        System.out.println("The product of two num " +c);
        System.out.println("The product of two num " +d);
        System.out.println("The product of two num " +f);
        System.out.println("The division of two num " + e);
    }

}