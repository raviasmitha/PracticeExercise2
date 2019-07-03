package com.stackroute.exercise2;
import com.stackroute.exercise2.IsEven;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class IsEvenTest {
    IsEven isEven;

    @Before
    public void setUp() {

        isEven = new IsEven();
    }

    @After
    public void tearDown() {

        isEven = null;
    }
    @Test
    public void testEvenNmShouldReturnTrue(){
        boolean result= isEven.isEven(122232);
        assertTrue(result);
    }

    @Test
    public void testOddNmShouldReturnFalse(){
        boolean result= isEven.isEven(91223);
        assertFalse(result);
    }
    @Test
    public void testNegativeNumber(){

        boolean result= isEven.isEven(-20);
        assertTrue(result);
    }

}