package com.stackroute.javap2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CheckPowerOfFourTest {
    CheckPowerOfFour four;

    @Before
    public void setUp() {
        System.out.println("Before");
        four = new CheckPowerOfFour();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        four = null;
    }

    @Test
    public void givenNumberShouldReturnPowerOfFour() {
        boolean result = four.isPowerOfFour(64);
        assertEquals(true, result);
    }
    @Test
    public void givenNumberShouldReturnNotPowerOfFour() {
        boolean result = four.isPowerOfFour(925);
        assertEquals(false, result);
    }

}
