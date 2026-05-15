public class Palindrome_6 {

    public static void main(String[] args) {
        
        /*
        
             *** Palindrome in Java ***
    
                -- A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). For example, "madam", "racecar", and "A man, a plan, a canal, Panama" are all palindromes. 
                -- A palindrome can also be a sequence of numbers or other types of data that can be compared in a similar way.

            *** Algorithm to Check if a String is a Palindrome ***
            1. Initialize two pointers, left and right, to the beginning and end of the string, respectively.
            2. While left is less than right, do the following:
            3. Compare the characters at the left and right pointers.
            4. If they are not equal, return false.
            5. Increment left and decrement right.
            6. If the loop completes without finding any mismatches, return true.
            7. Otherwise, return false. 


                
                

        */

        // String str = "A man, a plan, a canal, Panama";
        // String str = "madam";
        String str = "12321";
        checkPalindrome(str);

    }


    public static void checkPalindrome(String str){

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Given String is not a Palindrome : "+str);
                return;
            }
            left++;
            right--;
        }

        System.out.println("Given String is a Palindrome : "+str);

    }
    
}
