
// Given 2 arrays find distinct elements among them by doing some Union or some shet

import java.util.*;

class UnionDistinct {

    static void printUnion(int[] a, int n, int[] b, int m) {
        // create new hashmap hashmaop(keys,values)
        // hashmap doesnt contain repetitive values, all keys are distinct
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

        // Inserting array elements in mp
        for (int i = 0; i < n; i++) {
            // storing the keys so that even if they are repeated it just counts it once
            mp.put(a[i], i);
        }
        for (int i = 0; i < m; i++) {
            // storing distinct keys idk why they using i as the value here lol?!
            mp.put(b[i], i);
        }

        System.out.println("The union set of both arrays is :");
        for (Map.Entry mapElement : mp.entrySet()) {
            System.out.print(mapElement.getKey() + " ");

            // mp will contain only distinct
            // elements from array a and b
        }
        System.out.println("The number of disctinct elements is " + mp.size());
    }

    // Driver Code
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 6, 2, 3, 5 };
        int b[] = { 2, 4, 5, 6, 8, 9, 4, 6, 5 };

        printUnion(a, 7, b, 9);
    }
}
