package com.stackroute.exercise2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() {

        palindrome = new Palindrome();
    }

    @After
    public void tearDown() {

        palindrome = null;
    }
    @Test
    public  void TestgivenPalindromeShouldReturnTrue(){
        boolean result= palindrome.isPalindrome("madam");
        assertTrue(result);

    }
    @Test
    public  void TestgivenNonPalindromeShouldReturnFalse(){
        boolean result= palindrome.isPalindrome("Never");
        assertFalse(result);

    }
    @Test
    public void TestgivenPalindromeShouldReturnTrueValue(){
        boolean result= palindrome.isPalindrome("madam");
        assertTrue(result);
    }
}




