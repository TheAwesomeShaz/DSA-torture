package Arrays;

import java.util.*;

//Question

// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

// Explanation: 
// 2, -3, 1 is the subarray 
// with sum 0.
//********************************************************************** */
// Input
// 5
// 4 2 0 1 6

// Output: 
// Yes

// Explanation: 
// 0 is one of the element 
// in the array so there exist a 
// subarray with sum 0.

class DriverSubarraySum {
    public static void main(String[] args) {
        int arr[] = { 4, 2, -3, 1, 6 };
        new SubArraySum().yesOrNO(arr);
    }
}

class SubArraySum {
    public void yesOrNO(int[] arr) {
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        boolean found = false;

        for (int element : arr) {

            set.add(sum);

            sum += element;

            if (set.contains(sum)) {
                found = true;
                break;
            }

        }
        System.out.println("Is zero found?? " + found);
    }
}
