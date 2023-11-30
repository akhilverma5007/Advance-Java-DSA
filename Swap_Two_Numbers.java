public class Swap_Two_Numbers {

    static int defaultValue = 100;
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("Swapped value of a : " + a);
        // System.out.println("Swapped value of b : " + b);
        int one = 10;
        int two = 20;
        swap(one, two);
        System.out.println(one + " " + two);

        test();
       
        
    }

    static void swap(int one, int two){
        int temp = one;
        one = two;
        two = temp;
    }

    static void test(){
        System.out.println(defaultValue);
    }


}
