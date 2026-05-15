import java.util.Scanner;

public class FibonacciSeriesFirstN1_4 {
    
    /*

    *** Fibonacci Series(First N Terms) in Java ***
    -- The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. The first few terms of the Fibonacci series are: 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.

    *** Algorithm to Generate Fibonacci Series (First N Terms) ***
    1. Initialize the first two terms of the Fibonacci series, a = 0 and b = 1.
    2. Print the first term a.
    3. For i from 2 to n, do the following:
        a. Print the current term b.
        b. Calculate the next term as b = a + b.
        c. Update a to the current value of b.
    4. End the loop.


    -- ex.   Fn = Fn-1 + Fn-2
            F0 = 0
            F1 = 1
            F2 = F1 + F0 = 1 + 0 = 1
            F3 = F2 + F1 = 1 + 1 = 2
            F4 = F3 + F2 = 2 + 1 = 3
            F5 = F4 + F3 = 3 + 2 = 5
            F6 = F5 + F4 = 5 + 3 = 8
            and so on...

    *** Why Fibonacci Series is Important? ***
    1. Fibonacci series has applications in various fields such as mathematics, computer science, and nature. It is used in algorithms, data structures, and even in the analysis of financial markets.
    2. The Fibonacci series is closely related to the golden ratio, which is a mathematical constant that appears in various natural phenomena and has been used in art and architecture for centuries.
    3. The Fibonacci series is also used in the analysis of algorithms, particularly in the study of recursive algorithms and dynamic programming. It serves as a classic example of how to optimize recursive solutions using memoization or iterative approaches.


    
    */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series : ");
        int n = sc.nextInt();

        fibonacciSeries(n);



    }

    public static void fibonacciSeries(int n){
        int a = 0, b = 1;
        System.out.print(a+" ");
        for(int i=1; i<=n; i++){
            System.out.print(b+" ");
            int next = a + b;
            a = b;
            b = next;
        
        } 
    }

}
