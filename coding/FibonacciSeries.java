package org.git.coding;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =10;
        int firstNumber=0;
        int secondNumber=1;


        System.out.println("Fibonacci Series till " + n + " terms:");
        for(int i=0;i<n;i++){
            System.out.print(firstNumber + ", ");
             int nextTerm = firstNumber + secondNumber;
             firstNumber = secondNumber;
             secondNumber = nextTerm;
        }



    }
}
