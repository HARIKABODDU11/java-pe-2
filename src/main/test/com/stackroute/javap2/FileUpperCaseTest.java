package com.stackroute.javap2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FileUpperCaseTest {
    FileUpperCase fileUpperCase;

    @Before
    public void setUp() {
        //Arrange

        //Act
        System.out.println("Before");
        //Assert
        fileUpperCase = new FileUpperCase();
    }

    @After
    public void tearDown() {
        //Arrange

        //Act
        System.out.println("After");
        //Assert
        fileUpperCase = null;
    }

    @Test
    public void givenNumberShouldReturnLength() {
        //Arrange

        //Act
        int result = fileUpperCase.fileReader("/home/boddu/hello.txt");
        //Assert
        assertEquals(8, result);
    }

}