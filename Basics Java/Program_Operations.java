import java.util.Scanner;

public class Program_Operations {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 1: ");
        int num2 = in.nextInt();
        System.out.print("Choose Operation +, -, *, / : ");
        String operator = in.next();
        int sum = 0;
        if(operator.equals("+")){
            sum = num1 + num2;
        }else if(operator.equals("-")){
            sum = num1 - num2;
        }else if(operator.equals("*")){
            sum = num1 * num2;
        }else if(operator.equals("/")){
            sum = num1 / num2;
        }
        System.out.println("Calculation of " + num1 + " " + operator + " " + num2 + " is " + sum);
    }
}

