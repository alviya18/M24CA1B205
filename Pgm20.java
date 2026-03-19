//find the average of N +ve integers,raising exception for each -ve input
import java.util.Scanner;

public class Pgm20 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of integers: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException("N must be positive.");
            }

            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = sc.nextInt();

                if (num < 0) {
                    throw new IllegalArgumentException("Negative number entered: " + num);
                }

                sum += num;
                count++;
            }

            double average = (double) sum / count;
            System.out.println("Average: " + average);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}