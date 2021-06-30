import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a");
        a= scn.nextInt();
        System.out.println("Enter b");
        b= scn.nextInt();
        if(a>b){
        System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(a+" is less than "+b); 
        }
        else{
            System.out.println(a+" is equal to "+b); 
        }
    }
}
