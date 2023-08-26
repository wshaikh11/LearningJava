package org.git.exception;

public class ExceptionDemo {

    public static int demo() throws ArithmeticException{
        int a = 5;
        if(a ==5){
            throw new ArithmeticException();
        }
        return 1;
    }
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("11");
        } catch (NumberFormatException n){
            System.out.println("This block handles NumberFormat Exception");
        } catch (Exception e){
            System.out.println("This block handles all exception type");
        }
        finally {
            System.out.println("in finally");
        }


        try {
            int a[] = new int[5];
//            a[5] = 30/0;
//            System.out.println(a[5]);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException ae){
            System.out.println("Arithmetic exception occurs");
        } catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Array out of bound exception occurs");
        } catch (Exception e){
            System.out.println("Parent exception");
        }

        System.out.println("rest of the code");


//        int a = 5;
//        if(a == 5){
//            throw new ArithmeticException();
//        }

        int result = demo();




    }
}

