package org.git.design.creational.abstractfactory;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I'm Teacher");
    }
}
