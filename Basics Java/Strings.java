public class Strings {
    public static void main(String[] args) {
        String abc = "Akhil";
        String bce = "Akhil";
        System.out.println(abc == bce); //true
        System.out.println(abc.equals(bce)); //true

        String name = "Akhil Verma";
        System.out.println(name);
        
        String a = "Akhil";
        System.out.println(a);
        
        //Here we have not changed the object we have created a new object
        a = "Verma";
        System.out.println(a);
        
        //Comparision of Strings
        String nameA = "test";
        String nameB = "test";
        
        System.out.println(nameA == nameB);
        
        
        //.equals method
        String name1 = new String("akhilverma");
        String name2 = new String("akhilverma");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        
        //Function overrideing
        //we have overritten the toString inbuilt function by java.util.Arrays.toString method
        System.out.println(java.util.Arrays.toString(new int[]{12,34,22,5,6,3}));
        //Its output is a string
        
                //Wrapper class
                Integer num = new Integer(323);
                System.out.println(num.toString());
                
                //Pretty Printing (Formatted String)
                float ab = 434.432333f;
                System.out.printf("Formatted number is %.2f", ab);
                System.out.println();
                System.out.printf("Pie: %3f",Math.PI);
                System.out.println();
                //Place Holders
                System.out.printf("Hello my name is %s and I am %s", "Akhil", "Cool");
                System.out.println();
                System.out.println();
        
        
            /*
            Format Specifier	Conversion Applied
                %%	Inserts a % sign
                %x %X	Integer hexadecimal
                %t %T	Time and Date
                %s %S	String
                %n	Inserts a newline character
                %o	Octal integer
                %f	Decimal floating-point
                %e %E	Scientific notation
                %g	Causes Formatter to use either %f or %e, whichever is shorter
                %h %H	Hash code of the argument
                %d	Decimal integer
                %b %B	Boolean
                %a %A	Floating-point hexadecimal 
            */
        
            //String Concatination Operator
            System.out.println("String Concatination Operator");
            //adding ascii value of character
            System.out.println('a' + 'b');
            //Concatinating the strings
            System.out.println("a" + "b");
            System.out.println('a' + 3);
            System.out.println((char)('a' + 3));
            System.out.println("a" + 1); //toString is called
        }
    }
    
 