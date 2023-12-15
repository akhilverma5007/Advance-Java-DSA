import java.sql.Struct;

public class Oops_Java {
    public static void main(String[] args) {
        // Store 5 RollNos
        // int[] rollNos = {1,2,3,4,5};
        // System.out.println(java.util.Arrays.toString(rollNos));

        // String[] names1 = {"name1", "name2", "name3", "name4", "name5"};
        // System.out.println(java.util.Arrays.toString(names1));

        // int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;
        // System.out.println(java.util.Arrays.toString(numbers));

        // //Store data of 5 students{roll nos, name, marks}
        // int[] roll_ = new int[5];
        // String[] name_ = new String[5];
        // float[] marks_ = new float[5];


        // Classes and Objects
        Student[] studentsData = new Student[5];

        // Creating instances of the outer class to instantiate the inner class
        Student akhil = new Oops_Java().new Student(); 
        Student ronak = new Oops_Java().new Student();

        // Assigning values to the properties of the akhil object
        akhil.rollno = 10;
        akhil.name = "Akhil Verma";
        akhil.marks = 64.3f;

        // Assigning values to the properties of the ronak object
        ronak.rollno = 20;
        ronak.name = "Ronak Verma";
        ronak.marks = 44.3f;

        // Assigning akhil and ronak objects to the studentsData array
        studentsData[0] = akhil;
        studentsData[1] = ronak;

        // Printing properties of the first student in studentsData array
        System.out.println(studentsData[0].rollno);
        System.out.println(studentsData[0].name);
        System.out.println(studentsData[0].marks);

        System.out.println(" ");

        // Printing properties of the second student in studentsData array
        System.out.println(studentsData[1].rollno);
        System.out.println(studentsData[1].name);
        System.out.println(studentsData[1].marks);

        // Invoking the greeting method of the ronak object
        ronak.greeting();
    }

    // Create a class for every single student
    class Student {
        int rollno;
        String name;
        float marks;

        // Constructor for initializing default values
        Student() {
            this.rollno = 0;
            this.name = "";
            this.marks = 0f;
        }

        // Overloaded constructor with parameters
        Student(int rollno_, String name_, float marks_){
            this.rollno = rollno_;
            this.name = name_;
            this.marks = marks_;
        }

        // Method to print a greeting
        void greeting() {
            System.out.println("Hi, my name is " + this.name);
        }
    }
}