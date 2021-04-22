// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times

//Examples

// Input: nums = [3,2,3]
// Output: [3]

// Input: nums = [1]
// Output: [1]

import java.applet.*; // import random shet so that the file looks yellow in sidebar cuz incomplete
//**********************LOGICAL ERROR INCOMPLETE****************************
//COMPILE ACCEPTED BUT SUBMIT REJECTED

import java.util.*;

class DriverMajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 3, 3 };
        List<Integer> answer = new MajorityElement().majorityElement(arr);
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}

class MajorityElement {
    public List<Integer> majorityElement(int[] arr) {
        int num1 = -1, num2 = -1, count1 = 0, count2 = 0, len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1)
                count1++;
            else if (arr[i] == num2)
                count2++;
            else if (count1 == 0) {
                num1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                num2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num1 == arr[i]) {
                count1++;
            } else if (num2 == arr[i]) {
                count2++;
            }
        }
        if (count1 > len / 3) {
            ans.add(num1);
        } else if (count2 > len / 3) {
            ans.add(num2);
        }
        return ans;
    }
}
