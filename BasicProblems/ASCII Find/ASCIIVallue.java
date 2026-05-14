
import java.util.Formatter;


public class ASCIIVallue {

    public static void main(String[] args) {
        

    // *** Option 1: Character ASCII Value in Java Program Using Naive Approach

    char ch = 'a';

    int ASCIIVallue = ch;   // automatically type casted to int
    System.out.println(ASCIIVallue);


    // *** Option 2: Character ASCII Value in Java Program Using ASCII Type Casting

    char ch1 = 'b';
    int asciivalue = (int) ch1;
    System.out.println(asciivalue);


    // *** Option 3: Character ASCII Value in Java Program Using Formate Specifiers

    char ch2 = 'c';
    // Initializing the format specifier
    Formatter f = new Formatter();

    // Store the ASCII value of the character in the variable f
    // formate specifier
    f.format("%d", (int)ch2);
    System.out.println(f);

    
    // *** Option 4: Character ASCII Value in Java Program Using Function

    // Function that returns ASCII value of a character
    
    char ch3 = 'd';
    int asciiValue = getAsciiValue(ch3);
    System.out.println(asciiValue);



   



























    }

    // Function that returns ASCII value of a character
    public static int getAsciiValue(char ch) {
        return (int) ch;
    }


    
}
