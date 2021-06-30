import java.util.Scanner;
import java.lang.Math;

public class AreaPerimeter {

    public static void main(String[] args) {
        double r;
        double p,a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        r= scn.nextDouble();
        p= 2* Math.PI*r;
        System.out.println("the perimeter of circle is "+p);  
        a=  Math.PI*r*r;
        System.out.println("the perimeter of circle is "+a); 
      
    }

}