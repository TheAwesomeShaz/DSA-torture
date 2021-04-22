
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

        System.out.println("The kth smallest element is " + new Ksmallest().kthSmallest(arr, k));

        sc.close();
    }
}

class Ksmallest {

    public int kthSmallest(int[] arr, int k) {
        // Sort the given array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }
}
