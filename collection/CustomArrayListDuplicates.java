package org.git.collection;

import java.util.ArrayList;

public class CustomArrayListDuplicates extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }
        return super.add(o);
    }

    public static void main(String[] args) {
        CustomArrayListDuplicates customArrayListDuplicates = new CustomArrayListDuplicates();
        customArrayListDuplicates.add("Wasim");
        customArrayListDuplicates.add("Wasim");

        System.out.println(customArrayListDuplicates);
    }
}
