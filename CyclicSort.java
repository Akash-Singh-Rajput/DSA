package com.DSABOOTCAMP;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,3,5,6,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else {
                i++;
            }
        }
        return arr;
    }
}
