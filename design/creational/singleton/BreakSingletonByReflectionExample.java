package org.git.design.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

 class BreakSingletonByReflection {
     private static BreakSingletonByReflection breakSingletonByReflection = null;

     String str = "";

     private BreakSingletonByReflection() {
         str = "Wasim";

         if(breakSingletonByReflection != null){
             throw  new RuntimeException("Don't try to break singleton pattern");
         }
     }

     public static BreakSingletonByReflection getInstance() {
         if (breakSingletonByReflection == null) {
             breakSingletonByReflection = new BreakSingletonByReflection();
         }
         return breakSingletonByReflection;
     }

 }

 public class BreakSingletonByReflectionExample {

     public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         BreakSingletonByReflection singletonDemo1 = BreakSingletonByReflection.getInstance();
         BreakSingletonByReflection singletonDemo2 = BreakSingletonByReflection.getInstance();
         singletonDemo2.str = singletonDemo2.str.toUpperCase();

         //System.out.println(singletonDemo1.str);

         Constructor<BreakSingletonByReflection> constructor = BreakSingletonByReflection.class.getDeclaredConstructor();
         constructor.setAccessible(true);
         BreakSingletonByReflection singletonDemo3 =  constructor.newInstance();

         singletonDemo3.str = "asim";
         System.out.println(singletonDemo1.str);
         System.out.println(singletonDemo2.str);
         System.out.println(singletonDemo3.str);

     }
 }

