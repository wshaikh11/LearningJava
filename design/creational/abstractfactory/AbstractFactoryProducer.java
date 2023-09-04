package org.git.design.creational.abstractfactory;

public class AbstractFactoryProducer {

    public static AbstractFactory getProfession(boolean isTrainee){
        if(isTrainee){
            return new TraineeProfessionAbstractFactory();
        }
        else {
            return new ProfessionAbstractFactory();
        }
    }
}
