package com.company;

public class SelectionSort {
    public static void main(String[] args) {


        int arr[] = {4,1,7,3};

        int n = arr.length;

        for(int i=0;i<n-1;i++){

            int min_ind = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind])
                    min_ind =j;

                int temp= arr[min_ind];
                arr[min_ind] = arr[i];
                arr[i] = temp;

            }
        }
        int n1 = arr.length;
        for (int k=0; k<n1; ++k)
            System.out.println(arr[k]+" ");

    }
}
