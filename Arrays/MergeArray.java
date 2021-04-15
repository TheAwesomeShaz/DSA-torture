package Arrays;

import java.util.*;

// Merge Without Extra Space
// Input:
// N = 4, M = 5
// arr1[] = {1, 3, 5, 7}
// arr2[] = {0, 2, 6, 8, 9}
// Output: 0 1 2 3 5 6 7 8 9
// Explanation: Since you can't use any 
// extra space, modify the given arrays
// to form 
// arr1[] = {0, 1, 2, 3}
// arr2[] = {5, 6, 7, 8, 9}
class DriverMergeArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };

        new MergeArray().mergeArray(arr1, arr2);
    }
}

class MergeArray {

    // This is a very non optimised brute force solution

    public void mergeArray(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    // swap them nibbas
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        // Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        Arrays.sort(arr2);
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }

    }

}