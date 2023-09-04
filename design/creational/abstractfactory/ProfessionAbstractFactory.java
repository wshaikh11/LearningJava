package org.git.design.creational.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String professionType) {
        if(professionType.equals("Doctor")){
            return new Doctor();
        } else if (professionType.equals("Teacher")) {
            return new Teacher();
        }
        return null;
    }
}
