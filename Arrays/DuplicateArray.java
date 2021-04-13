package Arrays;

import java.util.*;

class DriverDuplicateArray {
    public static void main(String[] args) {

        int nums[] = { 1, 2, 5, 6, 2, 3, 5 };

        System.out.println("The number of duplicate elements is " + new DuplicateArray().findDuplicate(nums));

    }
}

class DuplicateArray {
    public int findDuplicate(int[] nums) {
        int duplicateNumber = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                duplicateNumber = nums[i];
            }
        }
        return duplicateNumber;
    }
}