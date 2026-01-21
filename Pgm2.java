// Static
// Function to find the nth Fibonacci number
import java.util.Scanner;
public class Pgm2 {
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        return fibonacci(num-2)+fibonacci(num-1);
        
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("n? (assume the first term an is a0) : ");
        n=sc.nextInt();
        System.out.println(n + "th term in the Fibonacci Series is : " + fibonacci(n));
    }
}
