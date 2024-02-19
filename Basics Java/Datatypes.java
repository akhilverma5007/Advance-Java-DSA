public class Datatypes {
    public static void main(String[] args){
        //Datattypes
        //Primitives : Data types which you cannot break further
        char letter = 'r';
        int roll = 10;
        long largeInteger = 232343442442L;
        float marks = 10.32f;
        double largeDecimalNumber = 103023033.233;
        boolean check = true;

        //Non Primitives
        String name = "Akhil Verma"; 
        System.out.println(name);
        
        //Class of Integer - Wrapper Class
        Integer rno = 64;
        rno.toString();
        System.out.println(rno);
        System.out.println(rno.getClass().getName());
        // System.out.println(rno instanceof Integer);

        System.out.println(letter);
        System.out.println(roll);
        System.out.println(largeInteger);
        System.out.println(marks);
        System.out.println(largeDecimalNumber);
        System.out.println(check);
    } 
}
