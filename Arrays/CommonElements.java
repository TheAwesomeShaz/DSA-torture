
//Question: Find common elements among the arrays
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.

class DriverCommonElements {
    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 40, 80 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1 = A.length, n2 = B.length, n3 = C.length;

        new CommonElements().getCommonElements(A, B, C, n1, n2, n3);
        ;
    }
}

class CommonElements {
    public void getCommonElements(int[] ar1, int[] ar2, int[] ar3, int n1, int n2, int n3) {
        int i = 0, j = 0, k = 0;

        // Iterate through three arrays while all arrays have elements
        while (i < n1 && j < n2 && k < n3) {
            // If x = y and y = z, print any of them and move ahead
            // in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            }

            // x < y
            else if (ar1[i] < ar2[j])
                i++;

            // y < z
            else if (ar2[j] < ar3[k])
                j++;

            // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }
}
