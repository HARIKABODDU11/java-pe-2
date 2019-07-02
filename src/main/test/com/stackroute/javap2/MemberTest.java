package com.stackroute.javap2;

import static org.junit.Assert.*;

import org.junit.*;


public class MemberTest {
    public static Member member;
    public static Member.MemberVariable memberVariable;
    @BeforeClass
    public static void setUp()
    {
        member = new Member();
        memberVariable=member.new MemberVariable();

    }
    @AfterClass
    public  static  void tearDown(){
        member=null;
        memberVariable=null;
    }
    @Test
    public void testForSetMember(){
        Member m1=memberVariable.setMember("harika",22,52);
        assertEquals(m1.name,"harika");
        assertEquals(m1.salary,22,0);
        assertEquals(m1.age,21);

    }
    @Test
    public void testForSetMemberDoubleValue(){
        Member m1=memberVariable.setMember("harika",22.60,52);
        assertEquals(m1.name,"harika");
        assertEquals(m1.salary,22,60);
        assertEquals(m1.age,21);

    }
    @Test
    public void testForSetMemberNullValue(){
        Member m1=memberVariable.setMember("null",0,50);
        assertEquals(m1.name,"null");
        assertEquals(m1.salary,0,0);
        assertEquals(m1.age,50);

    }

}