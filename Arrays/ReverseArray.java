package Arrays;

import java.util.*;
import java.io.*;

class Driver {
    public static void main(String args[]) throws IOException {
        // creating a buffered reader Object
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        // t takes in the number of test cases
        int t = Integer.parseInt(read.readLine());

        // until t becomes 0 while loop decrements the variable and does something
        while (t-- > 0) {
            // str reads and stores a String variable in it
            String str = read.readLine();
            // reversed array is printed
            System.out.println("Reversed Array is: " + new ReverseArray().reverseWord(str));
        }
    }
}

class ReverseArray {

    public String reverseWord(String str) {

        char[] temparray = str.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        return (String.valueOf(temparray));

    }

}