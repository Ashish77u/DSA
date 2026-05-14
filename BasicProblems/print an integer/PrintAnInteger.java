import java.util.Scanner;

public class PrintAnInteger {
    
    public static void main(String[] args) {
        

        /* 
            *** Coders' comments ***
        No need for a bunch of logic or any big figure, Just start with Java, when you print an integer!

        Na chahiye logic ka bhandar, na koi big figure, Shuruaat ho Java se, jab print ho integer!

        */

        // Option 1 : print intiger using hardcord

        int num = 5;
        System.out.println(num);



        // Option 2 : print intiger using scanner class

        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();

        System.out.println(num2);

    }

}
