package Arrays;

// Time spent: 1 hour

class DriverCountInversions {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 3, 5 };

        // was printing the brute force output
        // System.out.println(new CountInversions().countInversions(arr));

        // not even gonna print the output cuz its not mine

    }
}

class CountInversions {
    // This here is my bruteForceMethod of O(N^2)
    // public int countInversions(int[] arr) {
    // // int count = 0;
    // // for (int i = 0; i < arr.length; i++) {
    // // for (int j = i + 1; j < arr.length; j++) {

    // // if (arr[i] > arr[j]) {

    // // count++;
    // // }
    // // }
    // // }
    // // return count;
    // }

    // TLDR I understand what is going on but ill forget everything in 15 mins
    // The following functions use optimal approach of merge sort
    public int mergeSortAndCount(int[] arr, int l, int r) {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    public int mergeAndCount(int[] arr, int l, int m, int r) {
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i); // the elements to the right of array will be swaped or something watch
                                            // striver's vid
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

}