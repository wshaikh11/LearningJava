package org.git.coding;

public class ReverseArray {

    public static void swap(int [] arr,int front, int rear){
        int temp=arr[front];
        arr[front] = arr[rear];
        arr[rear] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,2,5,3};
        int swaping =arr.length/2;

        int front =0;
        int rear =0;

        front=0;
        rear=arr.length-1;

        for(int i=0;i<swaping;i++) {
            swap(arr,front,rear);
            front++;
            rear--;
        }

        for(int a : arr){
            System.out.println(a);
        }

    }
}
