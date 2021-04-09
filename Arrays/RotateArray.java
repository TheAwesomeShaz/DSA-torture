package Arrays;

import java.util.*;

import java.io.*;

// **********************Cyclically rotate an array by one***********************
// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4

class DriverRotateArray {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elemnts of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array after cyclic rotation by one is ");
        new RotateArray().rotateArray(arr, n);
    }
}

class RotateArray {
    public void rotateArray(int[] arr, int n) {
        int dummy[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (i + 1 <= n - 1) {
                dummy[i + 1] = arr[i];
            }

            if (i + 1 == n - 1) {
                break;
            }
        }

        dummy[0] = arr[n - 1];

        for (int i = 0; i < n; i++) {
            System.out.println(dummy[i] + " ");
        }
    }
}