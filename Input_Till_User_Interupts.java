//Take integer inputs till the user enters 0 and print the sum of all numbers(HINT: while loop)

import java.util.Scanner;

public class Input_Till_User_Interupts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number or else press 0 to exit.");
        int number;
        int sum = 0;

        do{
            number = input.nextInt();
            sum += number;
        }while(number!=0);
        System.out.println(sum);

//Take integer inputs till the user enters 0 and print the largest number from all.

        System.out.println("Enter a number or else press 0 to exit.");
        int number2;
        int largest = 0;

        do{
            number2 = input.nextInt();
            if(number2 > largest){
            largest = number2;
        }
        }while(number2!=0);
        System.out.println("Largest no is: " + largest);

    }
}