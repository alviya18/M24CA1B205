// Static Method
// Recursive function to find factorial of a number
import java.util.Scanner;
public class Pgm1{
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number? :");
        int num=sc.nextInt();
        System.out.println(+num+"! = "+factorial(num));
    }

}