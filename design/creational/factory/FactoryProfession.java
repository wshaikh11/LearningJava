package org.git.design.creational.factory;

public class FactoryProfession {

    public static Profession getProfession(String professionType) {
        if(professionType.equals("Doctor")){
            return new Doctor();
        } else if (professionType.equals("Engineer")) {
            return new Engineer();
        } else if (professionType.equals("Teacher")) {
            return new Teacher();
        }
        return null;
    }
}
