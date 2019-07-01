package com.stackroute.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerTest {
    @Test
    public void TestCheckPowerReturnFalse(){
        CheckPower checkPower = new CheckPower();
        boolean res=checkPower.isPower4(45);
        assertEquals(false,res);
    }

    @Test
    public void TestgivenPowerShouldReturnTrue(){
        CheckPower checkPower4 = new CheckPower();
        boolean res=checkPower4.isPower4(16);
        assertEquals(true,res);
    }

    @Test
    public void TestgivenNonPowerShouldReturnFalseValue(){
        CheckPower checkPower = new CheckPower();
        boolean res=checkPower.isPower4(25);
        assertEquals(false,res);
    }
}