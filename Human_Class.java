public class Human_Class {
    public static void main(String[] args) {
        System.out.println(Human_Class.population);
    }
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        //Constructor
        public Human_Class(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human_Class.population += 1;
        }
      
}
