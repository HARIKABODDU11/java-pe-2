package com.stackroute.javap2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    public Factorial f;
    @Before
    public void setUp(){
        f=new Factorial();
    }
    @After
    public void tearDown(){
        f=null;
    }
    @Test
    public void givenNumberShouldReturnFactorial(){
        //Arrange

        //Act
        String total=f.fact(6);
        //Assert
        assertEquals("success",total);
    }
    @Test
    public void givenNumberShouldReturnOutOfRange(){
        //Arrange

        //Act
        String total=f.fact(20);
        //Assert
        assertEquals("Out of range",total);
    }
    @Test
    public void givenNegativeNumberShouldReturnError(){
        //Arrange

        //Act
        String total=f.fact(-5);
        //Assert
        assertEquals("Error",total);
    }


}