package com.stackroute.exercise2;
import com.stackroute.exercise2.IsEven;
import org.hamcrest.core.Is;
import org.junit.Test;


import static org.junit.Assert.*;

public class IsEvenTest {
    @Test
    public void TestEvenNmShouldReturnTrue(){
        IsEven evenCheck=new IsEven();
        boolean res= evenCheck.isEven(122232);
        assertEquals(true,res);
    }

    @Test
    public void TestOddNmShouldReturnFalse(){
        IsEven evenCheck=new IsEven();
        boolean res= evenCheck.isEven(91223);
        assertEquals(false,res);
    }
}