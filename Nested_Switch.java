import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String empName = in.next();

        // switch(empId){
        //     case 1001:
        //     System.out.println("In the Management");
        //     break;
        //     case 1002:
        //     System.out.println("In the Org as Employee");
        //     break;
        //     case 1003:
        //     switch(empName){
        //         case "Akhil":
        //         System.out.println("Akhil Verma");
        //         break;
        //         case "Rohit":
        //         System.out.println("Rohit Kumar");
        //         break;
        //     }
        //     default:
        //     System.out.println("Invalid Employee");

            
        // }


        //Enhanced
        switch(empId){
            case 1001 -> System.out.println("In the Management");
            case 1002 -> System.out.println("In the Org as Employee");
            case 1003 -> {
                System.out.println("Emp no 3");
                switch(empName){
                case "Akhil" -> System.out.println("Akhil Verma");
                case "Rohit" -> System.out.println("Rohit Kumar");
                }
        }
    }    
    }
}
