// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Different_Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and operator to calculate the output.");
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        System.out.print("Enter Operation you want to perform: (+,-,/,*) : ");
        double operator = input.next().charAt(0);
        
        if(operator == '+'){
            System.out.println(number1 + number2);
        }
        else if(operator == '-'){
            System.out.println(number1 - number2);
        }
        else if(operator == '*'){
            System.out.println(number1 * number2);
        }
        else if(operator == '/'){
            System.out.println(number1 / number2);
        }
        else{
            System.out.println("Invalid Input. ");
        }
        System.out.println("");
    }
}
