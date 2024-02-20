import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String vegetables = in.next();


        // if(fruit == "mango"){

        // }
        // if(fruit.equals("mango")){
        // }
        //.equals only checks the value

        // String a = "mango";
        // String b = "mango";
        // System.out.println(a == b); //true

        // System.out.println(a.equals(b)); // true: only checks the value 

        // if(fruit.equals("apple")){
        //     System.out.println("Fruit is apple.");
        // }
        // if(fruit.equals("banana")){
        //     System.out.println("Fruit is banana.");
        // }

        switch(fruit){
            case "apple":
            System.out.println("Fruit is apple");
            break;
            case "banana":
            System.out.println("Fruit is banana.");
            break;
            default:
            System.out.println("none of the above");
        }

        //Enhanced Switch 
        switch (vegetables){
            case "tomato" -> System.out.println("Tomato");
            case "potato" -> System.out.println("Potato");
            case "corn" -> System.out.println("Corn");
            default -> System.out.println("Invalid");
        }


        //Nested Switch -> Switch inside a switch
    }
}
