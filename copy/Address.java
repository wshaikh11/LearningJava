package org.git.copy;

public class Address implements Cloneable {

    int addressId;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
