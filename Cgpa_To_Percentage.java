import java.util.Scanner;

public class Cgpa_To_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your CGPA ! Eg-> 8.4");
        double cgpa = in.nextDouble();
        double percentage = cgpa * 9.5;
        System.out.println("Percentage of cgpa: " + cgpa + " is: " + percentage);
    }
}
