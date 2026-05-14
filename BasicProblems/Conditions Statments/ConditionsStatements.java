
public class ConditionsStatements {

    public static void main(String[] args){

        // *** For loop 

        int n = 10;

        for(int i=0; i<=n;i++){
            System.out.print(i+" ");
        }


        // *** While loop 
        System.out.println();

        int i=5;
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }


        // *** Do-While loop 
        System.out.println();

        int j=0;
        do{
            System.out.print(j + " ");
            j++;
        }while(j<=5);


        // *** For-Each loop 
        System.out.println();

        int[] arr = {1,2,3,4,5,6,7,8};

        for (int k: arr){
          System.out.print(k+ " ");  
        }

    
}

}
