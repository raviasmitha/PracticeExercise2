package com.stackroute.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void givenNumberShouldReturnFactorial(){
        Factorial factorial= new Factorial();
        String res = factorial.Fact(6);
    }
}