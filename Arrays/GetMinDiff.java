package Arrays;

import java.util.*;
import java.io.*;
//****************** Minimize the Heights II ************************
//CONTROVERSIALL

// Input:
// K = 2, N = 4
// Arr[] = {1, 5, 8, 10}
// Output:
// 5
// Explanation:
// The array can be modified as 
// {3, 3, 6, 8}. The difference between 
// the largest and the smallest is 8-3 = 5.

class DriverGetMinDiff {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elemnts of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K");
        int k = sc.nextInt();

        System.out.println(
                "The difference between max and min height of towers is " + new GetMinDiff().getMinDiff(arr, n, k));

        sc.close();

    }
}

class GetMinDiff {
    public int getMinDiff(int[] arr, int n, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                arr[i] -= k;
                sum += arr[i];
            }
            if (arr[i] <= k) {
                arr[i] += k;
                sum += arr[i];
            }
        }
        return sum;
    }
}