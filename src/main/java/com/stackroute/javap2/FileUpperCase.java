package com.stackroute.javap2;

import java.io.FileReader;

public class FileUpperCase {
    public FileUpperCase()
    {

    }

    public int fileReader(String filePath)
    {
        try {

            int i;
            int length =0;

            FileReader fileReader = new FileReader(filePath);

            while((i = fileReader.read()) != -1)
            {
                System.out.print(Character.toUpperCase((char)i));
                length ++;
            }

            return length;
        }
        catch (Exception exception)
        {
            return 0;
        }
    }
}
