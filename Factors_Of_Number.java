//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
       
       
    }
}
