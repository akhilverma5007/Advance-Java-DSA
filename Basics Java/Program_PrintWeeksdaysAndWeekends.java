import java.util.Scanner;

public class Program_PrintWeeksdaysAndWeekends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Day to know week or weekend, Eg -> Monday");
        String days = in.next();
        switch(days){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Week Day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid Input.");
        }
    }
}
