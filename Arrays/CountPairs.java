
// Question
// Input:
// N = 4, K = 6
// arr[] = {1, 5, 7, 1}
// Output: 2
// Explanation: 
// arr[0] + arr[1] = 1 + 5 = 6 
// and arr[1] + arr[3] = 5 + 1 = 6.

class DriverCountPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int n = arr.length;
        int k = 6;
        System.out.println("No of pairs with sum " + k + " are  " + new CountPairs().getPairsCount(arr, n, k));
    }
}

class CountPairs {
    public int getPairsCount(int[] arr, int n, int k) {

        int noOfPairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    noOfPairs++;
                }
            }
        }
        return noOfPairs;
    }
}