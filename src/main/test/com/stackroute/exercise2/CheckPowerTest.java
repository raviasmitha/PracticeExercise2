package com.stackroute.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerTest {
    CheckPower checkPower;
    @Before
    public void setUp(){
        checkPower= new CheckPower();
    }
    @Test
    public void testCheckPowerReturnFalse(){
        boolean result=checkPower.isPower4(-45);
        assertFalse(result);
    }

    @Test
    public void testgivenPowerShouldReturnTrue(){
        boolean result=checkPower.isPower4(16);
        assertTrue(result);
    }

    @Test
    public void testgivenNonPowerShouldReturnFalseValue(){
        boolean result=checkPower.isPower4(25);
        assertFalse(result);
    }

}