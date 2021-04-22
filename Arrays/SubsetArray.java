import javax.lang.model.util.AbstractTypeVisitor14;

// Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.

// Input:
// a1[] = {11, 1, 13, 21, 3, 7}
// a2[] = {11, 3, 7, 1}
// Output:
// Yes
// Explanation:
// a2[] is a subset of a1[]

import java.applet.*; // import random shet so that the file looks yellow in sidebar
//**********************LOGICAL ERROR INCOMPLETE****************************
//COMPILE ACCEPTED BUT SUBMIT REJECTED

class DriverSubsetArray {
    public static void main(String[] args) {

        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 69, 1 };
        int n = arr1.length;
        int m = arr2.length;
        new SubsetArray().isSubset(arr1, arr2, n, m);
    }
}

class SubsetArray {
    public void isSubset(int[] arr1, int[] arr2, int n, int m) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    count++; // increase number of similar elements
                }
            }
        }
        if (count == n || count == m) {
            System.out.println("YES YES YES YES \n Y E S \n\n");
        } else {
            System.out.println("NO NO NO NO");
        }
    }
}