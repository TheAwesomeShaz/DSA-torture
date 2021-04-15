package Arrays;

import java.util.*;
import java.io.*;

class DriverMinJumps {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elemnts of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The minimum no. of jumps is " + new MinJumps().minJumps(arr, n));

        sc.close();
    }
}

class MinJumps {
    public int minJumps(int[] arr, int n) {
        int i = 0, j = 0;
        int count = 0;
        if (i < n) {
            // store first element in j
            j = arr[i];
            count++;
            // print j cuz idk

            // we are now accessing the second element
            j = arr[i++];
            count++;
            // j jumps ahead by increasing the index by the previous element's value
            if (i + j < n) {
                j = arr[i + j];
                count++;
            } else if (i + j > n) {
                j = arr[n];
                count++;
            }
        }
        return count;
    }

}
