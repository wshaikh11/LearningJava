package org.git.copy;

public class ShallowVsDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.rollNo = 26;

        Address a1 = new Address();
        a1.addressId= 2;

        s1.address = a1;

        System.out.println(s1.rollNo);


        //reference copy, new object is not created
        Student s2 = s1;
        System.out.println(s2.rollNo);

        Student s3 = (Student) s1.clone();
        s3.rollNo = 50;
        s3.address.addressId=4;
        System.out.println(s3.rollNo);
        System.out.println(s3.address.addressId);
        System.out.println(s1.address.addressId);
    }
}
