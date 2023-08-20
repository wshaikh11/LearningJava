package org.git.coding;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {1,4,6,8,9,0,2,4};

        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i] > arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        
        System.out.println(arr[arr.length-2]);
    }
}
