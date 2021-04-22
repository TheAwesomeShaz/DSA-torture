
// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is  6, -3, -10 which gives product as 180.

class DriverMaxProduct {
    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        new MaxProduct().maxProduct(arr);
    }
}

class MaxProduct {
    public void maxProduct(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int product = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = min;
                min = max;
                max = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            product = Math.max(product, max);

        }
        System.out.println(product);
    }
}
