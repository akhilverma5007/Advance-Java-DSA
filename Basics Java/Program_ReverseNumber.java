public class Program_ReverseNumber {
        public static void main(String[] args) {
            int number = 12345; // This is the number we want to reverse
            int reversedNumber = 0;
    
            while (number != 0) {
                int digit = number % 10; // Get the last digit of the number
                reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
                number = number / 10; // Remove the last digit from the number
            }
    
            System.out.println("Reversed Number: " + reversedNumber);
        }
    }
    