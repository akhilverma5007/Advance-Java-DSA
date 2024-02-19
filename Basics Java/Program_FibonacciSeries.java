//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Program_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate fibonacci series? ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        
        while(count <= n){
            int tempVar = i;
            i = i + p;
            p = tempVar;
            count++;
        }
        System.out.println(i);
    }    
}
