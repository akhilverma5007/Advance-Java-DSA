import java.util.Scanner;

public class Switch_Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();

        switch (fruits) {
            case "apple":
                System.out.println("Apple");
                break;

            case "Apple":
                System.out.println("Apple");
                break;

            case "orange":
                System.out.println("Orange");
                break;

            case "Orange":
                System.out.println("Orange");
                break;

            default:
                System.out.println("None of the above");
        }

        String fastfood = input.next();
        switch (fastfood){
            case "CholeBhature" -> System.out.println("Favourite");
            case "PaoBhaji" -> System.out.println("Not Favourite"); 
            default -> System.out.println("Invalid Input");             
        }

        int day = input.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Satday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Input");
        }

        int week = input.nextInt();
        // switch(week){
        //     case (1):
        //     case (2):
        //     case (3):
        //     case (4):
        //     case (5):
        //     System.out.println("Weekday");
        //     break;
        //     case (6):
        //     case (7):
        //     System.out.println("Weekend");
        //     break;
        //     default:
        //     System.out.println("Invalid day");
        // }

        //Enhanced switch
            switch (week) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("Weekend");
                default -> System.out.println("Invalid Input");
            }
    }   
}
