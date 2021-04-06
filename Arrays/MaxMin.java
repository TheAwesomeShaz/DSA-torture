package Arrays;

import java.io.*;

class DriverMaxMin {
    public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n Enter the size of array");
        int n = Integer.parseInt(read.readLine());

        int[] arr = new int[n];

        // until t becomes 0 while loop decrements the variable and does something

        System.out.println("Enter array element");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(read.readLine());

        }
        System.out.println(
                "Min element is " + new MaxMin().maxMin(arr)[0] + " Max element is " + new MaxMin().maxMin(arr)[1]);

    }
}

class MaxMin {
    public int[] maxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int[] dummy = new int[2];
        dummy[0] = min;
        dummy[1] = max;

        return dummy;
    }
}
