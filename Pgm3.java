// Non Static
// Function that generates the multiplication table
import java.util.Scanner;
public class Pgm3 {
    public void multiplication(int a,int b){
        for (int i=1;i<=b;i++){
            System.out.println(i+" x "+a+" = "+i*a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number ?");
        int a = sc.nextInt();
        System.out.println("Limit ?");
        int b = sc.nextInt();
        Pgm3 p=new Pgm3();
        p.multiplication(a, b);
    }
}
