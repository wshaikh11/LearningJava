package org.git.design.creational.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession tec = abstractFactory.getProfession("Teacher");
        tec.print();


    }
}
