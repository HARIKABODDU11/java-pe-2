package com.stackroute.javap2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PalindromeTest {
    Palindrome pal;

    @Before
    public void setUp() {
        System.out.println("Before");
        pal = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        pal = null;
    }

    @Test
    public void givenNumberShouldReturnPalindrome() {
        String result = pal.CheckPalindrome(932239);
        assertEquals("palindrome", result);
    }

    @Test
    public void givenNumberShouldReturnNotPalindrome() {
        String result = pal.CheckPalindrome(24245);
        assertEquals("not palindrome", result);
    }

}