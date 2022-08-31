import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 3, 5, 6, 8, 9, 12};
        
    }

    public static int binarySearch(int[] arr, int ele) {
        int s = 0, e = arr.length - 1;
        while(s <= e) {
            int mid = (s + e) / 2;
            if(arr[mid] == ele) {
                return mid;
            } else if (arr[mid] < ele) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}