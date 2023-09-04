package org.git.design.creational.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("Im Doctor");
    }
}
