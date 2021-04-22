
class DriverMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -2, 5 };
        int n = arr.length;
        System.out.println(new MaxSubArraySum().maxSubarraySum(arr, n));
    }
}

class MaxSubArraySum {

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.

    int maxSubarraySum(int arr[], int n) {
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
