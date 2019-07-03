package com.stackroute.javap2;

public class Member { //check the member variables returned correctly
    String name;
    int age;
    double salary;


    public class MemberVariable {
        Member m = new Member();
        public Member setMember(String name, double salary, int age) {

            m.name = name;
            m.salary = salary;
            m.age = age;

            return m;
        }

    }
}
