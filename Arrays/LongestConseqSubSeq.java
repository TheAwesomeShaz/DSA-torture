
import java.util.*;

// Input:
// N = 7
// a[] = {2,6,1,9,4,5,3}
// Output:
// 6
// Explanation:
// The consecutive numbers here
// are 1, 2, 3, 4, 5, 6. These 6 
// numbers form the longest consecutive
// subsquence.

class DriverLongestConseqSubSeq {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };

        // second test case
        // int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;

        new LongestConseqSubSeq().findLongestSubSeq(arr, n);
    }
}

class LongestConseqSubSeq {
    public void findLongestSubSeq(int[] arr, int n) {
        int count = 1; // start counting at 1 because the first element in the subsequence is also
                       // counted obvio
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i + 1] == arr[i] + 1) {
                count++;
            } else
                break;
        }
        System.out.println(count);
    }
}
