
public class EvenAndOdd{

    public static void main(String[] args) {
        
        /*
            *** Even And Odd Number Check ***

            Even number means a number that is divisible by 2, it can be positive, negative or zero. For example, -4, -2, 0, 2, 4, 6, 8 are even numbers.

            Odd number means a number that is not divisible by 2, it can be positive or negative. For example, -3, -1, 1, 3, 5, 7 are odd numbers.

            *** Why use it ***

            Even and odd number check is a common problem in programming, it is used to determine whether a given number is even or odd. This can be useful in various applications such as data analysis, algorithm design, and even in games.

        */


        // Option 1 : Java program to check whether a number is even or odd using Modulo Operator

        int num1 = 5; // declare and initialize a number

        if(num1 % 2 == 0){
            System.out.println(num1 + " is an even number.");
        }
        else{ 
            System.out.println(num1 + " is an odd number.");
        }


        // Option 2 : Java program to check whether a number is even or odd using Bitwise AND (&) Operator
        // Bitwise AND operator, who it works : it compares each bit of the number with 1, if the result is 1, then the number is odd, otherwise it is even.
        // example : 5 in binary is 101, 5 & 1 = 1 (odd), 4 in binary is 100, 4 & 1 = 0 (even)
        int num2 = 6; 

        if((num2 & 1) == 1){
            System.out.println(num2 + " is an odd number.");
        }
        else{
            System.out.println(num2 + " is an even number.");
        }


    }

}