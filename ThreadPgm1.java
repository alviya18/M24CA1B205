/*Write a Java program that creates two threads to perform the following:
Thread A (Extending Thread): 
   Print the squares of numbers from 1 to 10 with a delay of 500ms between each print.
Thread B (Implementing Runnable): 
Print the cubes of numbers from 1 to 10 with a delay of 700ms between each print.
Main Thread must ensure that the message "Calculations Complete!" is only printed after both threads have finished their execution.*/
class ThreadA extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 10; i++) {
                System.out.println(i+"² = "+i*i);
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ThreadB implements Runnable {
    public void run() {
        try {
            for(int i = 1; i <= 10; i++) {
                System.out.println( i + "³ = " + (i*i*i));
                Thread.sleep(700);
            }
        } catch(InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadPgm1{
    public static void main(String[] args) {
        ThreadA A = new ThreadA();
        ThreadB B = new ThreadB();
        Thread thread = new Thread(B);

        A.start();
        thread.start();

        try {
            A.join();
            thread.join();
        } catch(InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Calculations Complete!");
    }
}