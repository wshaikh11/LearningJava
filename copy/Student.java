package org.git.copy;

public class Student implements Cloneable {
    int rollNo;

    Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s1 =(Student) super.clone();
        s1.address = (Address) address.clone();
        return s1;
    }
}
