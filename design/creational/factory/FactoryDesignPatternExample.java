package org.git.design.creational.factory;

public class FactoryDesignPatternExample {
    public static void main(String[] args) {
        Profession doctor = FactoryProfession.getProfession("Teacher");
        doctor.print();
    }
}
