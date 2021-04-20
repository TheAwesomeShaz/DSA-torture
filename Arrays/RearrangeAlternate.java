package Arrays;

//Question
// Input:  arr[] = {1, 2, 3, -4, -1, 4}
// Output: arr[] = {-4, 1, -1, 2, 3, 4}

// Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}

class RearrangeAlternate {

    static void rearrange(int[] a, int n) {

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (a[i] < 0 && a[j] > 0) {
                swap(a, i, j);
                i++;
                j--;
            } else if (a[i] > 0 && a[j] < 0) {
                i++;
                j--;
            } else if (a[i] > 0 && a[j] > 0) {
                i++;
            } else if (a[i] < 0 && a[j] < 0) {
                j--;
            }
        }

        if (i == 0 || i == n) {
            printArray(a, n);
        } else {
            int k = 0;

            while (k < n && i < n) {
                swap(a, k, i);
                k = k + 2;
                i++;
            }

            System.out.println();
            System.out.print("The array after rearranging is >>>>> ");
            printArray(a, n);
        }

    }

    static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static void printArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -4, -1, 6, -9 };
        int n = arr.length;

        System.out.println();
        System.out.print("The given array is >>>>> ");
        printArray(arr, n);

        rearrange(arr, n);

    }
}