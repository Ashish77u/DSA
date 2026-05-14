
public class VowelAndConsonant {

    public static void main(String[] args) {

        /*
            *** Vowel And Contonant ***
            Vowel means A, E, I, O, U, a, e, i, o, u 
            Consonant means B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z

            *** Why use it ***
            vowel and consonant check is a common problem in programming, it is used to determine whether a given character is a vowel or a consonant. This can be useful in various applications such as text processing, language analysis, and even in games.

        
        */
        
        // Option 1 : Java program to check whether a character is vowel or consonant using if-else statement

        char ch1 = 'c';
        // check both lower and upper case
        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ||
           ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'){ 
            System.out.println("Given character is vowel : "+ch1); 
        }else{ 
            System.out.println("Given character is consonant : "+ch1); 
        }


        // Optina 2 : Java program to check whether a character is vowel or consonant using switch statement

        char ch2 = 'i';
        boolean flag = false;
        // switch is used to match character
        switch(ch2){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Given character is vowel : "+ch2);
                flag = true;
        }
        if (!flag) {
            System.out.println("Given character is consonant : "+ch2);
            
        }


        // Optina 3 : Java program to check whether a character is vowel or consonant using String 

        char ch3 = 'j';

        // Store all vowels in a String
        String vowels = "aeiouAEIOU";
        
        // using indexOf returns -1 if character is not found in String
        // indexOf means search character in String
        if(vowels.indexOf(ch3) != -1){
            System.out.println("Given character is vowel : "+ch3);
        }else{
            System.out.println("Given character is consonant : "+ch3);
        }


        
        // Optiona 4 : Java program to check whether a character is vowel or consonant using binary search in Array

        char ch4 = 'k';

        // Store all vowels in an Array
        char[] vowelsArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
    
        // binarySearch means search character in Array, it returns index of character if found, otherwise returns a negative value
        if (java.util.Arrays.binarySearch(vowelsArray, ch4) >= 0) {
            System.out.println("Given character is vowel : "+ch4);
        } else {
            System.out.println("Given character is consonant : "+ch4);
        }

        // second way to check vowel or consonant using Array for loop

        boolean isVowel = false;
        // loop throught array and check match character
        for(char v : vowelsArray){
            if(ch4 == v){
                isVowel = true;
                break;
            }
        }
        if(isVowel){
            System.out.println("Given character is vowel : "+ch4);
        }else{
            System.out.println("Given character is consonant : "+ch4);  
        }



        // 


    }
    
}
