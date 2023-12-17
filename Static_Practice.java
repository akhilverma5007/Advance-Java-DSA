public class Static_Practice {
    public static void main(String[] args) {
       greeting(); 
    //    System.out.println("aaa");
    }

    //this is not dependent on objects
    static void greeting(){
        System.out.println("Akhil");
        //fun(); 
        //you cannot use this becuase it requires an instance
        //but the function you are using it in does not depend on instances

        //Hence here we are referencing it
        Static_Practice obj = new Static_Practice();
        obj.fun();
    }
    
    //we know that something which is not static, belongs to an object.
    void fun(){
        System.out.println("Akhil");
        greeting();// you can use static inside non static
    }


}
