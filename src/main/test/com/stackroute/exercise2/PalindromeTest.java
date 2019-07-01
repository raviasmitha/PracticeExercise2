package com.stackroute.exercise2;
import org.junit.Test;


import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public  void TestgivenPalindromeShouldReturnTrue(){
        Palindrome palCheck=new Palindrome();
        boolean result= palCheck.isPalindrome("madam");
        assertEquals(true,result);

    }
    @Test
    public  void TestgivenNonPalindromeShouldReturnFalse(){
        Palindrome palCheck=new Palindrome();
        boolean result= palCheck.isPalindrome("Never");
        assertEquals(false,result);

    }
    @Test
    public void TestgivenPalindromeShouldReturnTrueValue(){
        Palindrome palCheck=new Palindrome();
        boolean result= palCheck.isPalindrome("madam");
        assertEquals(true,result);
    }
}




