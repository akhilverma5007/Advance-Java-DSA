import java.util.Scanner;

public class Program_EvenOddUsingMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check Even or Odd? ");
        int numb = in.nextInt();
        checkType(numb);
        
    }

    static void checkType(int num){
        if(num % 2 == 0){
            System.out.println("Its a Even Number.");
        }else{
            System.out.println("Its a Odd Number.");
        }
    }
}
