
import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first place number : ");
        int a = sc.nextInt();
        System.out.println("Enter second place number : ");
        int b = sc.nextInt();
        
        System.out.println("before a is : "+a);
        System.out.println("before b is : "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After a is : "+a);
        System.out.println("After b is : "+b);




    }
    
}
