package leedcode;

/**
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
**/

public class palindrome {
	public boolean isPalindrome(int x) {
        String palindromeString = Integer.toString(x);
        
        int numberHalfLength = palindromeString.length()/2;
        int numberLength = palindromeString.length();
        for(int i=0;i<numberHalfLength;i++){
            if(palindromeString.charAt(i)!=palindromeString.charAt(numberLength-1))
                return false;
            numberLength--;
        }
        
        return true;
    }
}
