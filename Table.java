import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i,a,c;
        
        Scanner scn= new Scanner(System.in);
        System.out.println("please enter a num");
        a = scn.nextInt();
        
        for(i=1;i<=10;i++)
        {
            c=a*i;
            
            System.out.println(a + " x " + i+ " = " + 
            (a * (i)));
        }

        
    }
}
