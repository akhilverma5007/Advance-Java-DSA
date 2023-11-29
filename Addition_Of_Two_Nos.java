//Addition Of Two Numbers

import java.util.Scanner;

public class Addition_Of_Two_Nos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Sum of two numbers is: " + (num1+num2));
    }    
}
