package org.git.design.creational.singleton;

import java.io.*;

class BreakingSingletonBySerialization  implements Serializable {
    private static BreakingSingletonBySerialization breakingSingletonBySerialization = null;

    private BreakingSingletonBySerialization(){

    }

    public static BreakingSingletonBySerialization getInstance(){
        if(breakingSingletonBySerialization == null){
            breakingSingletonBySerialization = new BreakingSingletonBySerialization();
        }
        return breakingSingletonBySerialization;
    }

    protected Object readResolve(){
        return breakingSingletonBySerialization;
    }
}

public class BreakingSingletonBySerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BreakingSingletonBySerialization breakingSingletonBySerialization1 = BreakingSingletonBySerialization.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(breakingSingletonBySerialization1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        BreakingSingletonBySerialization breakingSingletonBySerialization2 =(BreakingSingletonBySerialization) in.readObject();
        in.close();

        System.out.println(breakingSingletonBySerialization1.hashCode());
        System.out.println(breakingSingletonBySerialization2.hashCode());
    }

}


