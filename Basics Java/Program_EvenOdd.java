//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Program_EvenOdd {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number to check: ");
            int number = in.nextInt();
        
            if(number % 2 == 0){
                System.out.println("Its a Even number");
            }
            else{
                System.out.println("Its a Odd number");
            }

        }
}
