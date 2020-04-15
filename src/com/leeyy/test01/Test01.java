package com.leeyy.test01;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Test01 {
    public static void main(String[] args) throws Exception{
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd: info.getPropertyDescriptors()
        ) {
            System.out.println(pd.getName());
            System.out.println(" " + pd.getReadMethod());
            System.out.println(" " + pd.getWriteMethod());
        }
    }
}
class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
