
public class AlphabetOrNotCheck {

    public static void main(String[] args) {
        
        // Option 1 : Check Given Character is AlPhabet in java using ASCII(American Standard Code for Information Interchange) Range Check

        char ch1 = 's';
        // First check wheather the given character lies between upper case and lower case alphabet ranges
        if((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z')){
            System.out.println("Given character is alphabet : "+ch1);
        }else{
            System.out.println("Given character is not alphabet : "+ch1);
        }



        // Option 2 : Check Given Character is AlPhabet in java using Character Class

        char ch2 = 'd';
        // Character.isLetter() method returns true if the given character is alphabet
        if(Character.isLetter(ch2)){
            System.out.println("Given character is alphabet : "+ch2);
        }else{
            System.out.println("Given character is not alphabet : "+ch2);
        }



        // Option 3 : Check Given Character is AlPhabet in java using Regular Expression Match

        char ch3 = 'm';
        // Using Regular Expression pattern to check whether the given character is alphabet or not
        if(String.valueOf(ch3).matches("[a-zA-Z]")){    // regex pattern/match
            System.out.println("Given character is alphabet : "+ch3);
        }else{
            System.out.println("Given character is not alphabet : "+ch3);
        }



        // Optiona 4 : Check Given Character is AlPhabet in java Switch Case

        char ch4 = '8';
        boolean isAphabet = false;

        switch(ch4){    // switch case can be used with character as well as integer values
            case 'A' : case 'B' : case 'C' : case 'D' : case 'E' : case 'F' : case 'G' : case 'H' : case 'I' : case 'J' :
            case 'K' : case 'L' : case 'M' : case 'N' : case 'O' : case 'P' : case 'Q' : case 'R' : case 'S' : case 'T' :
            case 'U' : case 'V' : case 'W' : case 'X' : case 'Y' : case 'Z' :
            case 'a' : case 'b' : case 'c' : case 'd' : case 'e' : case 'f' : case 'g' : case 'h' : case 'i' : case 'j' :
            case 'k' : case 'l' : case 'm' : case 'n' : case 'o' : case 'p' : case 'q' : case 'r' : case 's' : case 't' :
            case 'u' : case 'v' : case 'w' : case 'x' : case 'y' : case 'z' :
                isAphabet = true;
        }

        if(isAphabet){
            System.out.println("Given character is alphabet : "+ch4);
        }else{
            System.out.println("Given character is not alphabet : "+ch4);
        }



        // Optina 5 : Check Given Character is AlPhabet in java using Ternary Operator

        char ch5 = 'x';

        // Ternay operator used to simplify condition
        String result = (ch5 >= 'A' && ch5 <= 'Z' || ch5 >= 'a' && ch5 <= 'z') ? "alphabet" : "not alphabet";
        System.out.println("Given character is "+result+" : "+ch5);


        






    }
    
}
