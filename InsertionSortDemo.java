package com.java.algo.practice;

public class InsertionSortDemo {
    public static void main(String []args){
        int arr[] = new int[]{5,7,1,3,2};
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
