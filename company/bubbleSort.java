package com.company;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {4, 1, 7, 3};
//
//        int n = arr.length;
//
//        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-i-1;j++){
//                    if(arr[j]>arr[j+1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//            }
//        }
//        int n1 = arr.length;
//        for (int k=0; k<n1; ++k)
//            System.out.println(arr[k]+" ");


        /// recursive bubble sort programing

        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[], int n) {
        if (n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }

            bubbleSort(arr,n-1);

        }


    }
}
