// Non Static
// Function that checks whether a number is prime or not

import java.util.Scanner;

public class Pgm4 {
    public boolean primeOrNot(int num){
        for(int i=1;i<=Math.sqrt(num);i++){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Number ?");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        Pgm4 p=new Pgm4();
        System.out.println(n+" is Prime : "+p.primeOrNot(n));
    }
}
