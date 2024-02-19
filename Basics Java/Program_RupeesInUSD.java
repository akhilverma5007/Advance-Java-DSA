//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Program_RupeesInUSD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount in rupess to convert in USD? ");
        int rupees = in.nextInt();
        double usd = rupees * 0.012;
        System.out.println("Conversion is " + usd);
    }
}