package org.git.exception;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface ExceptionInterface{
    void demo(String msg);
}

public class LambdaException {

    public static int  t1() throws SQLException {
        throw new SQLException();
    }
    public static void main(String[] args) throws SQLException {


//        ExceptionInterface exceptionInterface = msg ->  {
//            System.out.println("hello");
//            throw new RuntimeException(msg);
//        };
//
//
//        exceptionInterface.demo("Lambda expression");
//
//        int a = t1();

       Object i = Integer.valueOf(42);
       String str = (String) i;
        System.out.println(i);












        List<String> list = Arrays.asList("1","2","3","w");
        List<Integer> list1 = Arrays.asList(1,0);


        //approach 1
//        list.stream().forEach(s  -> {
//            try{
//                System.out.println(Integer.parseInt(s));
//            } catch (Exception ex){
//                System.out.println("exception" + ex.getMessage());
//            }
//        });

        //approach 2
       // list.stream().forEach(LambdaException::printList);

        //it will work but it is not generic
        //list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));

      //  list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)),NumberFormatException.class));
      //  list1.forEach(handleGenericException(s -> System.out.println(10/s),ArithmeticException.class));


        //handle Exception for checked exception
//        list1.forEach( s-> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(s);
//        });

        //list1.forEach(LambdaException::printList1);

    }

    public static void printList1(int s)  {
        try {
            Thread.sleep(2000);
            System.out.println(s);
        } catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }


    }

    //approach 2
    public static void printList(String s){
        try{
            System.out.println(Integer.parseInt(s));
        } catch (Exception ex){
            System.out.println("exception" + ex.getMessage());
        }
    }

    public static Consumer<String> handleExceptionIfAny(Consumer<String> payload){
        return obj -> {
            try {
                payload.accept(obj);
            } catch (Exception ex ){
                System.out.println("exception" + ex.getMessage());
            }
        };
    }

   public static <Target,Exobj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
                                                                                          Class<Exobj> exobjClass ){

       return obj -> {
           try {
               targetConsumer.accept(obj);
           } catch (Exception ex ){
               try {
                   Exobj exobj = exobjClass.cast(ex);
                   System.out.println("exception" + ex.getMessage());
               } catch (ClassCastException cex){
                   throw ex;
               }


           }
       };

   }
}
