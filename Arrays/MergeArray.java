
// Merge Without Extra Space
// Input:
// N = 4, M = 5
// arr1[] = {1, 3, 5, 7}
// arr2[] = {0, 2, 6, 8, 9}
// Output: 0 1 2 3 5 6 7 8 9
// Explanation: Since you can't use any 
// extra space, modify the given arrays
// to form 
// arr1[] = {0, 1, 2, 3}
// arr2[] = {5, 6, 7, 8, 9}

class DriverMergeArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };

        int n = arr1.length;
        int m = arr2.length;

        // new MergeArray().mergeArray(arr1, arr2);
        new MergeArray().mergeArrayGap(arr1, arr2, n, m);
    }
}

class MergeArray {

    // This is a very non optimised brute force solution
    // public void mergeArray(int arr1[], int arr2[]) {

    // for (int i = 0; i < arr1.length; i++) {
    // for (int j = 0; j < arr2.length; j++) {
    // if (arr1[i] > arr2[j]) {
    // // swap them nibbas
    // int temp = arr1[i];
    // arr1[i] = arr2[j];
    // arr2[j] = temp;
    // }
    // }
    // }
    // // Arrays.sort(arr1);
    // for (int i = 0; i < arr1.length; i++) {
    // System.out.print(arr1[i] + " ");
    // }

    // Arrays.sort(arr2);
    // for (int j = 0; j < arr2.length; j++) {
    // System.out.print(arr2[j] + " ");
    // }

    // }

    // This is HARDD Gap method
    private int nextGap(int gap) {
        if (gap <= 1) {
            return 0;
        }
        return (gap / 2) + (gap % 2);
    }

    public void mergeArrayGap(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0, gap = n + m;

        for (gap = nextGap(n + m); gap > 0; gap = nextGap(gap)) {

            // comparing elements of first array
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }

            // comparing elements in both arrays
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            if (j < m) {

                // comparing elements of second array
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {

                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }

        }
        for (int k = 0; k < n; k++) {

            System.out.print(arr1[k] + " ");
        }

        for (int k = 0; k < m; k++) {
            System.out.print(arr2[k] + " ");
        }

    }

}