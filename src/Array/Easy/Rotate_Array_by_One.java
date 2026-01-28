package Array.Easy;

//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class Rotate_Array_by_One {
    public void rotate(int[] arr) {
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
