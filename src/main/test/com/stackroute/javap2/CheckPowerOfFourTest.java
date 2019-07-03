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
        //Arrange

        //Act
        boolean result = four.isPowerOfFour(64);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumberShouldReturnNotPowerOfFour() {
        //Arrange

        //Act
        boolean result = four.isPowerOfFour(925);
        //Assert
        assertEquals(false, result);
    }
    @Test
    public void givenNumberShouldReturnFalse() {
        //Arrange

        //Act
        boolean result = four.isPowerOfFour(-1);
        //Assert
        assertEquals(false, result);
    }

}
