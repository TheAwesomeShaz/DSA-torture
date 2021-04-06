package Arrays;

import java.util.*;
import java.io.*;
import java.lang.*;

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
            System.out.println(new ReverseArray().reverseWord(str));
        }
    }
}

class ReverseArray {

    public String reverseWord(String str) {

        char[] arr = new char[str.length()];
        arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            swap(i, arr);
        }
        return arr.toString();

    }

    private static void swap(int i, char[] arr) {
        char temp = ' ';
        int n = arr.length;

        temp = arr[i];
        arr[i] = arr[n - i];
        arr[n - i] = temp;
    }
}