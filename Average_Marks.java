//Calculate Average Marks

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        System.out.print("Subject 1: ");
        int subject1 = in.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = in.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = in.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = in.nextInt();
        System.out.print("Subject 5: ");
        int subject5 = in.nextInt();

        int sum = subject1 + subject2 + subject3 + subject4 + subject5;
        float percetage = (sum * 100) / 500;

        System.out.println("Percentage of 5 subjects is : " + percetage);
    }
}
