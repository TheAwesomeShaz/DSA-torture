
import java.io.*;
import java.util.*;

//******************************************************************************************** */
//Arrange all negative elements of the array to left side and all positive arrays to right side
//******************************************************************************************** */

class DriverRearrange {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elemnts of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        new Rearrange().rearrange(arr, arr.length);

        sc.close();
    }
}

class Rearrange {

    public void rearrange(int arr[], int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        printArray(arr);
    }

    private void printArray(int[] arr) {
        System.out.println("The Rearranged Array is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}