
import java.util.Scanner;



public class ArmstrongNumber_7 {
    public static void main(String[] args) {
        
        /*
            *** Armstrong Number in Java ***

            -- An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

            *** algorithm to check if a number is an Armstrong number or not ***
            1. Initialize a variable sum to 0 and a variable temp to the given number.
            2. Calculate the number of digits in the given number and store it in a variable n.
            3. While temp is greater than 0, do the following:
                a. Get the last digit of temp and store it in a variable digit.
                b. Add digit raised to the power of n to sum.
                c. Remove the last digit from temp by dividing it by 10.
            4. If sum is equal to the given number, then it is an Armstrong number; otherwise, it is not.

        // int originalNum = num;
        // int sum = 0;
        // int n = String.valueOf(num).length();
        
        // while (num > 0) {
        //     int digit = num % 10;
        //     sum += Math.pow(digit, n);
        //     num /= 10;
        // }
        
        // if (sum == originalNum) {
        //     System.out.println(originalNum + " is an Armstrong number");
        // } else {
        //     System.out.println(originalNum + " is not an Armstrong number");
        // }
        
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        ArmstrongNumber(num);


        

        
        

    }    

    public static void ArmstrongNumber(int num){

        int originalNum = num;
        int digit = 0;
        int sum = 0;
        int temp = num;

        while(temp!=0){     // Step 1: Pehle pata karo ki number mein kitne digits hain
            digit++;
            temp /=10;
        }

        temp = num;         // save original number in temp;

        while(temp!=0){     // step 2: digits ko power karke sum mein add karo.
            int rem = temp % 10;   
            sum += (int)Math.pow(rem, digit);   // sum = sum + rem * rem * digit;
            temp /=10;    // temp = temp/10;
        }

        if(sum == originalNum){
            System.out.println(originalNum + " is an Armstrong number");
        }else{
            System.out.println(originalNum + " is not an Armstrong number");    
        }

    }

}

