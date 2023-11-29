//Factorial Program In Java

import java.util.Scanner;

public class Factorial_Program {
    public static void main(String[] args) {
        //5! = 5 × 4 × 3 × 2 × 1 = 120
        int temp = 1 ;
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Enter your factorial no : ");
        for (int i = 1; i <= number; i++) {
            temp *= i;
        }
        System.out.print(temp);
    }    
}
