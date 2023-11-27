//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;
public class Greeting_Message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name as input to show greeting message.");        
        String name = input.next();
        System.out.println("Hi " + name + ". Hope you doing good!. ");
        System.out.println("");
    }
     
}
