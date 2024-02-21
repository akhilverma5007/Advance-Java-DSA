//Define a method to find out if a number is prime or not.
import java.util.Scanner;
public class Question_PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean isPrime = true;
        if(number <=1){
            isPrime = false;
        }else{
            for (int i = 2; i < Math.sqrt(number); i++) { //number*number
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Number is Prime.");
        }else{
            System.out.println("Number is Not Prime.");
        }
    }

    
}
