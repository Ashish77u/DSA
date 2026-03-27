
public class SwapDiffMethods {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 8;
        
        // *** Using Arithmetic Method (Addition and Subtraction):

        a = a + b;      // a = 5 + 8 ;   a=13
        b = a - b;      // b = 13 - 8 ;  b=5
        a = a - b;      // a = 13 - 5 ;  a=8

        System.out.println("Swaping Using Arithmetic Method "+ "a = " + a + " and "+ "b = "+ b);


        // *** Using XOR Method (Best for integers):

        // Binary number system.
        // 5 = 0101  and 8 = 1000

        a = a ^ b;  // a=1101
        b = a ^ b;  // b=0101   ==> b=5
        a = a ^ b;  // a=1000   ==> a=8

        System.out.println("Swaping Using XOR Method "+ "a = " + a + " and "+ "b = "+ b);

        
        // *** Using Multiplication and Division:

        a = a * b;      // a = 5 * 8 ;   a=40
        b = a / b;      // b = 40 / 8 ;  b=5
        a = a / b;      // a = 40 / 5 ;  a=8

        System.out.println("Swaping Using Multiplication and Division Method "+ "a = " + a + " and "+ "b = "+ b);


    }
    
}
