package com.leeyy.test01;

public class Test02 {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day==Weekday.SUN){
            System.out.println("work at home");
        }else {
            System.out.println("work dat office");
        }
    }
}

enum  Weekday{
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
