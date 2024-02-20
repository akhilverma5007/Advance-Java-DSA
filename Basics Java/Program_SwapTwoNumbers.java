import java.util.Scanner;

public class Program_SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Numbers to Swap their values: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Before Swap Number 1: ");
        int number1 = in.nextInt();
        System.out.print("Before Swap Number 2: ");
        int number2 = in.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.print("After Swap Number 1: " + number1 + "\n");
        System.out.print("After Swap Number 2: " + number2 + "\n");

    }
}
