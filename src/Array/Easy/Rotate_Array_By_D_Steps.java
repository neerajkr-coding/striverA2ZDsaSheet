package Array.Easy;
//https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

//🔁 Algorithm: Array Rotation using Reversal Method
//    Compute effective rotations:
//    steps = d % n (to handle d > n)
//    Reverse the entire array.
//    Reverse the first (n - steps) elements.
//    Reverse the last steps elements.
//
//🧠 Key Idea
//    Rotation is achieved by reordering elements via reversals
//    Each reversal is done in-place, so no extra space is used
//
//⏱ Complexity
//    Time: O(n)
//    Space: O(1)

public class Rotate_Array_By_D_Steps {
    static void rotateArr(int arr[], int d) {
        // code here
        int steps =  d % arr.length;

        reverseSubArray(arr, 0, arr.length - 1);
        reverseSubArray(arr, 0, arr.length - 1 - steps);
        reverseSubArray(arr, arr.length - steps, arr.length - 1);
    }

    static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
