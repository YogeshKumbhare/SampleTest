package com.company;

import javax.sound.midi.Soundbank;

public class MergeSort {
    int[] array;
    int[] temparray;
    int length;

    public static void main(String[] args) {
        int[] inputArray = {48, 32, 54, 23, 4};
        MergeSort ms = new MergeSort();
        ms.sort(inputArray);

        for (int print : inputArray) {
            System.out.println(print);
        }
    }

    private void sort(int[] inputArray) {
        this.array = inputArray;
        this.length = inputArray.length;
        this.temparray = new int[length];
        divideArray(0, length - 1);

    }

    private void divideArray(int lInd, int hInd) {
        if (lInd < hInd) {
            int mid = lInd + (hInd - lInd) / 2;
            divideArray(lInd, mid);  /// sort the left side array - recursion way
            divideArray(mid + 1, hInd);  /// sort the right side array  -recursion way

            mergeArray(lInd, mid, hInd);
        }
    }

    private void mergeArray(int lInd, int mid, int hInd) {
        for (int i = lInd; i <= hInd; i++) {
            temparray[i] = array[i];
        }
        int i = lInd;
        int j = mid + 1;
        int k = lInd;
        while (i <= mid && j <= hInd) {
            if (temparray[i] <= temparray[j]) {
                array[k] = temparray[i];
                i++;
            } else {
                array[k] = temparray[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            array[k] = temparray[i];
            k++;
            i++;
        }
    }
}
