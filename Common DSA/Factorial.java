import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        

        /*
            *** Factorial of a Number in Java ***

            -- The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. It is denoted by n!. For example, 5! = 5 * 4 * 3 * 2 * 1 = 120.
            -- The factorial of 0 is defined to be 1, i.e., 0! = 1.
            -- The factorial of a negative integer is not defined.
            -- The factorial function is used in various fields such as mathematics, statistics, and computer science. It is often used in combinatorics, probability theory, and algorithm design.

            *** algorithm to calculate factorial of a number ***
            1. If n is 0, return 1.
            2. If n is 1, return 1.
            3. Otherwise, return n * factorial(n-1).


        
        */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer :");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println("Factorial of "+n+" is : "+result);


    }

    public static int factorial(int n){
        
        if(n==0 || n==1) return 1 ;
        return n * factorial(n-1);



    }
    
}
