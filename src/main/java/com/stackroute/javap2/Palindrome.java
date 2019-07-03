package com.stackroute.javap2;

public class Palindrome {
    public String CheckPalindrome(int num) { //check the number is palindrome or not
        int m, a = 0, x;
        m = num;
        while (num > 0) {

            x = num % 10;

            a = a * 10 + x;

            num = num / 10;

        }


        if (a == m) {
            return "palindrome";
        } else {
            return "not palindrome";
        }


    }
}
