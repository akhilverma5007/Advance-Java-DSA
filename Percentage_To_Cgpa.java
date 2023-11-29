import java.util.Scanner;

public class Percentage_To_Cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter percentage marks! Eg-> 84");
        double percentage = in.nextDouble();
        double cgpa = percentage / 9.5;
        System.out.println("CGPA of percent: " + percentage + " is: " + cgpa);
    }
}
