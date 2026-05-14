import java.util.Scanner;

class CustException extends RuntimeException{

    public CustException(String message){
        super(message);
    }
    
}


public class CustomeException {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();


        try {
            
            if(num<0){
                throw  new CustException("Number is not negative Enter a positive number." + num);
            }else{
                System.out.println("Number is : "+num);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}