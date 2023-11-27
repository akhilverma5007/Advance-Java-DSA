//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
       System.out.println("");
       System.out.println("Enter a number to check whether its Even/Odd");
       int number = input.nextInt();
       if(number % 2 == 0){
           System.out.println(number + " is Even. ");
       }else{
           System.out.println(number + " is Odd. ");
       }
       System.out.println("");
    }   
}
