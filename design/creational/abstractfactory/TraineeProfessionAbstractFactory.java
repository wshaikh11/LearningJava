package org.git.design.creational.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

    @Override
    public Profession getProfession(String professionType) {
        if(professionType.equals("Doctor")){
            return new TraineeDoctor();
        } else if (professionType.equals("Teacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
