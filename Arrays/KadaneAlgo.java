
import java.io.*;

// **********************Kadane Algorithm***********************
// Input:
// N = 5
// arr[] = {1,2,3,-2,5}
// Output:
// 9
//sum  of all elements of array basically 

class DriverKadaneAlgo {
    public static void main(String args[]) throws IOException {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the Size of Array");
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // System.out.println("Enter the elemnts of Array");
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        int[] arr = { -1, -2, -4, 4, 5, -2, 6, 7 };
        int n = arr.length;
        System.out.println("The SUM OF ALL ELEMENTS OF THE ARRAY IS: " + new KadaneAlgo().sumOfElements(arr, n));

    }
}

class KadaneAlgo {
    public int sumOfElements(int[] arr, int n) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}