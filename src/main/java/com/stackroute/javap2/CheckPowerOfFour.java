package com.stackroute.javap2;


public class CheckPowerOfFour { //this method will check power of four or not

    public boolean  isPowerOfFour(int n)
    {
        if(n < 0)
            return false;
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }
        return true;
    }
}

