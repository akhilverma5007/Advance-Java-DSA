public class Functions {
    public static void main(String[] args) {
        sum();
        int ans = sum2();
        System.out.println(ans);

        String output = sum3();
        System.out.println(output);

        int out = sum4(100, 200);
        System.out.println(out);


        System.out.println(greeting("Akhil"));
    }


    static void sum(){
        int num1 = 10;
        int num2 = 20;
        System.out.println((num1+num2));
    }

    static int sum2(){
        int number1 = 10;
        int number2 = 39;
        int sumof = number1 + number2;
        return sumof;
    }

    static String sum3(){
        String name = "Akhil Verma";
        return name;
    }

    static int sum4(int one, int two){
        int total = one + two;
        return total;
    }

    static String greeting(String name){
        name = "Your Name is " + name;
        return name;
    }
}
