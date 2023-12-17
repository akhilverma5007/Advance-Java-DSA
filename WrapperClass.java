public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;//you dont get much options in a.
        int b = 20;
        Integer num = 35; //its a object now, you can do num. (more functions options)
        swap(a, b);
        System.out.println(a + " " + b);
        
        swap2(a,b);
        System.out.println(a + " " + b);

        //They will not swap because they are primitivies and In Java 
        //there is no such thing as Pass By Reference, Everything is Pass By Value.

        swap3();
        
        final int bonus = 100;
        // bonus = 33; // you will get error modiifiying this 

        
        A akhil = new WrapperClass().new A("Akhil Verma");
        akhil.name = "Other name";
        
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap2(Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
            //Here when you pass objects the reference valuse is passed ?
            //Still not swapping? Why? 
            //Because Integer is a final Class
    }

    static void swap3(){
        int num1 = 100;
        int num2 = 200;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);

        //This will swap because its swapping inside the function only nothing to pass here
    }

    class A {
        final int num = 10;
        String name;

        //Constructor
        public A(String name){
            this.name = name;
        }
    }

}
