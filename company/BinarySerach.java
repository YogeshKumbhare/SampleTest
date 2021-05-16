package com.company;
//
//public class BinarySerach {
//    int binarySearch(int arr[], int x) {
//        int r = arr.length - 1;
//
//        int l = 0;
//
//        while (l <= r) {
//
//            int m = l + (r - l) / 2;
//            // check if x is present at mid
//            if (arr[m] == x)
//                return m;
//
//            if (arr[m] < x)
//                l = m + 1;
//            else
//                r = m - 1;
//
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {2, 5, 3, 1, 7, 4};
//
//        int x = 5;
//
//        BinarySerach b = new BinarySerach();
//        int d = b.binarySearch(arr, x);
//
//        if (d == -1)
//            System.out.println("element not present ");
//        else
//            System.out.println(" element is present ");
//
//    }
//
//}


import java.util.Arrays;

// Java implementation of iterative Binary Search
class BinarySerach {
    // Returns index of x if it is present in arr[],
    // else return -1
    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySerach ob = new BinarySerach();
        int arr[] = { 2, 5, 3, 1, 7, 4 };


      //  Arrays.binarySearch(arr,5);
Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,5));
        Arrays.sort(arr);
        int n = arr.length;
        int x = 5;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}