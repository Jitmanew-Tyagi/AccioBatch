import java.util.*;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7};
        int[] arr2 = {3, 4, 6, 8, 9, 10, 12, 14};
        display(merge(arr, arr2));

    } 

    public static int[]  merge(int[] a1, int[] a2) {
        int[] ans = new int[a1.length + a2.length];
        int idx = 0;
        for(int i : a1) {
            ans[idx] = i;
            idx ++;
        }

        for(int i : a2) 
            ans[idx ++] = i;

        Arrays.sort(ans);
        return ans;
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}