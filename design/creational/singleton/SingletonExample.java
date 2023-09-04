package org.git.design.creational.singleton;

import java.lang.reflect.InvocationTargetException;

 class SingletonDemo {
     private static SingletonDemo singletonDemo = null;

     String str = "";

      private SingletonDemo() {
         str = "Wasim";
     }

     public static SingletonDemo getInstance() {
         if (singletonDemo == null) {
             singletonDemo = new SingletonDemo();
         }
         return singletonDemo;
     }

 }

 public class SingletonExample {
     public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
         SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
         singletonDemo2.str = singletonDemo2.str.toUpperCase();

         System.out.println(singletonDemo1.str);


     }
}



