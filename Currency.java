// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter currency to convert.");
        System.out.print("Enter amount: ");
        float amount = input.nextFloat();
        double conversion = amount * 83.33;
        System.out.println("USD Conversion is: " + conversion);
        System.out.println(""); 
    }
}
