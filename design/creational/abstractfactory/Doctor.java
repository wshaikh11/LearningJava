package org.git.design.creational.abstractfactory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I'm Doctor");
    }
}
