//Calculate Average Of N Numbers

import java.util.Scanner;

public class Calc_Average_Of_Numbers {
    public static void main(String[] args) {
        //1 2 3 => 6/3 => 2
        System.out.println();
        System.out.println("Enter no of numbers you want to enter");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Enter nos");
        int number;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            number = input.nextInt();
            sum += number;
        }
        
        int average = sum / n;
        System.out.println("Average of " + n + " numbers is: " + average);

        
    }    
}
