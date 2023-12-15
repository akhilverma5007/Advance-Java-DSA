public class Constructor_Overloading {
        int rollno;
        String name;
        float marks;
    
        // Default constructor
        public Constructor_Overloading() {
            rollno = 0;
            name = "";
            marks = 0.0f;
        }
    
        // Parameterized constructor with two parameters
        public Constructor_Overloading(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
            this.marks = 0.0f; // Default value for marks
        }
    
        // Parameterized constructor with three parameters
        public Constructor_Overloading(int rollno, String name, float marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    
        // Other methods and functionalities can be added here
    
}
