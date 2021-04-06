package Arrays;

import java.io.*;
import java.util.*;

class DriverKsmallest {
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

        System.out.println("The kth smallest element is " + new Ksmallest().kthsmallest(arr, k));

        sc.close();
    }
}

class Ksmallest {
    public int kthsmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
