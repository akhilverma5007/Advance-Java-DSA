import java.util.Scanner;

public class FunctionsMethods {
    public static void main(String[] args) {
        additionOfTwoNumbers();
        System.out.println(sum(10,20));
        System.out.println(concatinate("Akhil ", "Verma"));
    }

    static void additionOfTwoNumbers(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to do sum: ");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);
    }

    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String concatinate(String one, String two){
        String str = one + two;
        return str;
    }
}

