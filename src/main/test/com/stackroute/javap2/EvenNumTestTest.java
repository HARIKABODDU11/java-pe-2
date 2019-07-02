package com.stackroute.javap2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class EvenNumTestTest {
        public EvenNumTest t;

        @Before
        public void setUp()
        {
            System.out.println("Before");
            t = new EvenNumTest();

        }
        @After
        public void tearDown() {
            System.out.println("After");
            t = null;
        }
        @Test
        public void testOneNumberShouldReturnTrue(){
            boolean result=t.isEven(74);
            assertEquals(true,result);

        }
        @Test
        public void testOneNumberShouldReturnFalse(){
            boolean result=t.isEven(41);
            assertEquals(false,result);

        }
        @Test
        public void testOneNumberShouldReturn(){
            boolean result=t.isEven(78);
            assertEquals(true,result);

        }

    }

