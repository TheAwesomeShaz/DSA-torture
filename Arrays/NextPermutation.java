
//Question: Implement next permutation, which rearranges numbers in next dictionary order

//Input: nums = [1,2,3]
//Output: [1,3,2]
// The replacement must be in place dont make new array

// Algorithm
// traverse the array in reverse until a[i]<a[i+1]
// now find another "element" in the array such that the  "element">a[i]
// swap a[i] and the element
// (let i be index1 and element is index2 then)
// reverse everything to the right of index1+1 i.e i+1 

class DriverNextPermutation {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };

        new NextPermutation().nextPermutation(arr);
    }
}

class NextPermutation {
    public void nextPermutation(int[] arr) {
        // default condition if nothing in array do nothing
        if (arr == null || arr.length <= 1)
            return;

        // the breakPoint can be at the secondlast index so das y i = Length-2
        int i = arr.length - 2;

        // traverse the array in reverse order until we find the breakpoint
        // i.e arr[i] >= arr[i + 1]
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        // traverse the array in reverse order until we find an element greater than
        // a[i]
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i])
                j--;
            // the loop has ended now we are at the element which is > a[i] so we swap it
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);
        printArray(arr);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void reverse(int[] arr, int i, int j) {
        // i is traversing from the front of the array
        // j is traversing from the back of the array
        // when both reach at center or pass each other reversing stops
        while (i < j)
            swap(arr, i++, j--);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}