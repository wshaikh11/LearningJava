package org.git.design.creational.singleton;


class BreakingSingletonByCloningExample implements Cloneable{

    private static BreakingSingletonByCloningExample breakingSingletonByCloningExample = null;

    private  BreakingSingletonByCloningExample() {

    }

    public static BreakingSingletonByCloningExample getInstance(){
        if(breakingSingletonByCloningExample == null){
            breakingSingletonByCloningExample = new BreakingSingletonByCloningExample();
        }
        return breakingSingletonByCloningExample;
    }

    @Override
    public BreakingSingletonByCloningExample clone() throws CloneNotSupportedException {
       throw  new CloneNotSupportedException();
    }
}

public class BreakingSingletonByCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        BreakingSingletonByCloningExample breakingSingletonByCloningExample1 = BreakingSingletonByCloningExample.getInstance();
        BreakingSingletonByCloningExample breakingSingletonByCloningExample2 = breakingSingletonByCloningExample1.clone();

        System.out.println(breakingSingletonByCloningExample1.hashCode());
        System.out.println(breakingSingletonByCloningExample2.hashCode());


    }



}
