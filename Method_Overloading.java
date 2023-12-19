public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        
        Method_Overloading obj = new Method_Overloading();
        System.out.println(obj.sum(11, 10, 22, 33));  
    } 
   
    static int sum (int a, int b){
        return a+b;
    }

    static int sum (int a, int b, int c){
        return a+b+c;
    }

    int sum (int a, int b, int c, int d){
        return a+b+c+d;
    }
}
