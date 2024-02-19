import java.util.Scanner;

public class Program_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Program to print the multiplication table.");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number! ");
        int number = in.nextInt();
        for(int i = number; i <= number*10; i+=number){
            System.out.println(i);
        }
    }
}
