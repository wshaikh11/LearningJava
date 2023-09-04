package org.git.design.creational.singleton;

enum EnumExample {
    RED,
    GREEN,
    BLUE;

    EnumExample(){
        System.out.println("in constructor");
    }
}

public class EnumTest{

    public static void main(String[] args) {
        EnumExample c1 = EnumExample.BLUE;
        System.out.println(c1);
    }
}
