//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Program_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate fibonacci series? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }    
}
