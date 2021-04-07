package Arrays;

import java.io.*;

class DriverSortWithoutSort {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\n Enter the size of array");

        int n = Integer.parseInt(read.readLine());

        int[] arr = new int[n];
        System.out.println("Enter array element");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(read.readLine());
        }

        int[] array = new SortWithoutSort().sortWithoutSort(arr);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class SortWithoutSort {
    public int[] sortWithoutSort(int[] arr) {
        int[] dummy = new int[3];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                dummy[0]++;
            }
            if (arr[i] == 1) {
                dummy[1]++;
            }
            if (arr[i] == 2) {
                dummy[2]++;
            }
        }
        int index = 0;
        index = increaseArray(0, dummy, arr, index);
        index = increaseArray(1, dummy, arr, index);
        index = increaseArray(2, dummy, arr, index);

        return arr;
    }

    private int increaseArray(int i, int[] dummy, int[] arr, int index) {
        // i is the index of 012 array whereas
        // index is the index of final Array

        System.out.println("Currently storing all the " + i + "s in the array");

        while (dummy[i]-- > 0) {
            arr[index] = i;
            System.out.println("the value of i is " + i + " The value of index is " + index
                    + " the array element will be" + arr[index]);
            index++;
        }
        return index;
    }
}
