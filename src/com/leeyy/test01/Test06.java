package com.leeyy.test01;

public class Test06 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Studnet01.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
    }
}

class Person01{
    public String name;
}
class Studnet01 extends Person01{
    public int score;
    private int grade;
}