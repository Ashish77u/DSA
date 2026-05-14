
import java.util.Scanner;

public class EvenOrOdd {

     public static void main(String[] args){

        /*
            *** Program to check whether a number is even or odd ***
            -- even number is a number which is divisible by 2 and odd number is a number which is not divisible by 2.

            
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number.");
        }

     }
}