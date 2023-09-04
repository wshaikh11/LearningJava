package org.git.design.creational.singleton;

import java.lang.reflect.InvocationTargetException;

public class EnumDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        PreventBreakingSingletonByReflection preventBreakingSingletonByReflection1 = PreventBreakingSingletonByReflection.INSTANCE;
        PreventBreakingSingletonByReflection preventBreakingSingletonByReflection2 = PreventBreakingSingletonByReflection.INSTANCE;
        //preventBreakingSingletonByReflection1.setValue(2);
        preventBreakingSingletonByReflection2.setValue(4);
        System.out.println(preventBreakingSingletonByReflection1.getValue());
        System.out.println(preventBreakingSingletonByReflection2.getValue());

        // this will give us exception
//        Constructor<PreventBreakingSingletonByReflection> constructor = PreventBreakingSingletonByReflection.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        PreventBreakingSingletonByReflection preventBreakingSingletonByReflection3 = constructor.newInstance();
//        System.out.println(preventBreakingSingletonByReflection3.getValue());




    }
}
