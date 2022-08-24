import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {1, 3, 2, 5, 4, 8, 7, 6, 10, 0};
        // sort(arr);
        // display(arr);
        int[] arr = {1, 3, 4, 7, 8, 3, 5, 6, 8, 9, 12};
        Arrays.sort(arr);
        display(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < arr.length; i ++) {
            for(int j = 0; j < n - i; j ++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}