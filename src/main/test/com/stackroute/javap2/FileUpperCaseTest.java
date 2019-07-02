package com.stackroute.javap2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FileUpperCaseTest {
    FileUpperCase fileUpperCase;

    @Before
    public void setUp() {
        System.out.println("Before");
        fileUpperCase = new FileUpperCase();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        fileUpperCase = null;
    }

    @Test
    public void givenNumberShouldReturnLength() {
        int result = fileUpperCase.fileReader("/home/boddu/hello.txt");
        assertEquals(8, result);
    }

}