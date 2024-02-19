import java.util.Scanner;

public class Program_CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();
        int count = 0;
        while (number > 0) {
            int rem = number % 10;
            if(rem == 5){
                count++;             
            }
            number = number / 10;
        }
        System.out.println(count);
}
}
