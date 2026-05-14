
public class Patterns {

    public static void main(String[] args) {
        

        // *** i=row and j=columns

        /*

            *
            **
            ***
            ****
            *****
            ******
        
        */

        int n = 5;

        // 1. Approach One.

        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }






    }
    
}
