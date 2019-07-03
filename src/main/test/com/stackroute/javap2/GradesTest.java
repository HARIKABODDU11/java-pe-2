package com.stackroute.javap2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradesTest {
    public Grades num;
    @Before
    public void setUp(){
        System.out.println("Before");
        num=new Grades();
    }
    @After
    public void tearDown(){
        //Arrange

        //Act
        System.out.println("After");
        //Assert
        num=null;
    }
    @Test
    public void givenGradesShouldReturnSum(){
        //Arrange

        //Act
        int[] array={89,90,78,70};
        String total=num.avg(array,4);
        //Assert
        assertEquals("Average is81",total);
    }
    @Test
    public void givenGradesShouldReturnMinimum(){
        int[] array={89,90,78,70};
        String minimum=num.minimum(array,4);
        assertEquals("Minimum is70",minimum);
    }
    @Test
    public void givenGradesShouldReturnMaximum(){
        int[] array={35,56,78};
        String maximum=num.maximum(array,3);
        assertEquals("Maximum is78",maximum);
    }

}