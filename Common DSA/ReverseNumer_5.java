
import java.util.Scanner;

public class ReverseNumer_5 {

    public static void main(String[] args) {
        
        /*
        
        *** Reverse a Number in Java ***
        -- Reversing a number is a common programming problem that involves taking a given number and reversing the order of its digits. For example, if the input number is 12345, the output would be 54321.
        -- Reversing a number can be useful in various applications, such as checking for palindromic numbers, performing mathematical operations, or simply for formatting purposes.
        -- To reverse a number in Java, you can use a loop to iterate through each digit of the number and add it to a new variable, which is then printed in reverse order.

        *** Algorithm to Reverse a Number in Java ***
        1. Initialize a variable to store the reversed number, say `reversed`, and set it to 0.
        2. While the input number is greater than 0, do the following:
            a. Multiply the `reversed` variable by 10.
            b. Add the last digit of the input number (obtained using modulus operator) to `reversed`.
            c. Remove the last digit from the input number (using integer division).
        3. The `reversed` variable now contains the reversed number. Print or return it as needed.


        */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        reverseNumber(num);




    }

    public static void reverseNumber(int num){

        int reversed = 0;
        while(num!=0 || num>2){

            int lastDigit = num % 10;

            reversed = reversed * 10 + lastDigit;

            num = num / 10;

        }

        System.out.println("Reversed Number : "+reversed);

    }
    
}
