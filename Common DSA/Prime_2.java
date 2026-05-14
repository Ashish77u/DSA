
import java.util.Scanner;

public class Prime_2 {

    public static void main(String[] args) {

        /*
         *** Program to check whether a number is prime or not ***
           
           -- A prime number is a natural number greater than 1 that cannot be formed by
           multiplying two smaller natural numbers.
           -- A natural number greater than 1 that is not prime is called a composite
           number.
           -- The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29.
           
           -- A prime number is a number that has only two factors: 1 and itself.
           -- A composite number is a number that has more than two factors.
           
           -- To check whether a number is prime or not, we can use the following
           algorithm:
           1. If the number is less than or equal to 1, it is not prime.
           2. If the number is less than or equal to 3, it is prime.
           3. If the number is divisible by 2 or 3, it is not prime.
           4. For numbers greater than 3, we can check for factors from 5 to the square
           root of the number.
           We can skip even numbers (i.e., check for factors of the form 6k ± 1) to
           optimize the process.
           5. If a factor is found, the number is not prime.

          ** Why use it ***
           -- Prime number check is a common problem in programming, it is used to
           determine whether a number is prime or not. It is often used in various
           applications such as cryptography, number theory, and algorithm design.
           
           
           
          */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num) ? num + " is a prime number." : num + " is not a prime number.");

    }

    public static boolean isPrime(int num) {

        // some edge cases --> edge cases are the cases which are not covered in the main logic of the program, but they can cause the program to fail if not handled properly.
        if (num <= 1)
            return false; // 0 and 1 are not prime numbers
        if (num <= 3)
            return true; // 2 and 3 are prime numbers

        if (num % 2 == 0 || num % 3 == 0)
            return false; // numbers divisible by 2 or 3 are not prime numbers

        // explain this part in detail --> so ya part explain karna hai ki hum 5 se start karenge aur square root of num tak jayenge, aur hum even numbers ko
        // skip karenge (i.e., check for factors of the form 6k ± 1) to optimize the process.

        // example : num = 29, square root of 29 is 5.38, to hum 5 se start karenge aur 5.38 tak jayenge, aur hum even numbers ko skip karenge, to hum 5 aur 7 ko check karenge, agar 29 5 se divisible nahi hai aur 29 7 se divisible nahi hai, to 29 is a prime number.

        // example : num = 137 , square root of 137 is 11.7, to hum 5 se start karenge aur 11.7 tak jayenge, aur hum even numbers ko skip karenge, to hum 5, 7, 11 ko check karenge, agar 137 5 se divisible nahi hai aur 137 7 se divisible nahi hai aur 137 11 se divisible nahi hai, to 137 is a prime number.

        for (int i = 5; i * i <= num; i += 6) { // check for factors from 5 to the square root of the number, skipping even numbers
            if (num % i == 0 || num % (i + 2) == 0)
                return false; // if a factor is found, the number is not prime
        }

        return true;
    }

}
