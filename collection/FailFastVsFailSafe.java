package org.git.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {
    public static void main(String[] args) {

        List<Integer> arrayList = Arrays.asList(1,3,4,5);

        Iterator<Integer> e = arrayList.iterator();

//        while (e.hasNext()){
//            System.out.println(e.next());
//            arrayList.add(6);
//        }

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
        copy.add(1);
        copy.add(2);
        copy.add(3);

        Iterator<Integer> e1 = copy.iterator();
        while (e1.hasNext()){
            System.out.println(e1.next());
            copy.add(6);
        }
        System.out.println(copy);


    }
}
